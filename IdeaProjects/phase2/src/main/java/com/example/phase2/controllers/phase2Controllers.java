package com.example.phase2.controllers;

import com.example.phase2.country;
import com.example.phase2.service.get;
import com.example.phase2.service.send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class phase2Controllers {
    public Boolean booleanVal;
    @Autowired
    public get getService;

    @Autowired
    public send sendService;

    @RequestMapping(value = "/add", method =  RequestMethod.POST)
    @PostMapping
    public void get(@RequestBody List<country> countryList) throws IOException {

        booleanVal = getService.getRequest(countryList);

    }

    @RequestMapping(value="/validate",method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String,String> send() throws IOException {

        HashMap<String, String> map = new HashMap<>();
        map=sendService.sendRequest(booleanVal);
        return map ;
    }
}