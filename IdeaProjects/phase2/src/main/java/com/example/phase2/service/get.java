package com.example.phase2.service;

import com.example.phase2.country;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class get {
    @Autowired
    public maxmind maxmind ;

    public Boolean getRequest(List<country> countryList) throws IOException
    {
        Boolean booleanVal;
        String maxmindData= maxmind.data();
        System.out.println(maxmindData);
        ObjectMapper mapper = new ObjectMapper();
        Ipdetails user = mapper.readValue(maxmindData, Ipdetails.class);
        System.out.println(Arrays.toString(countryList.toArray()));
            booleanVal = Arrays.toString(countryList.toArray()).contains(user.getCountry_code());
            System.out.println(booleanVal);
            return booleanVal;
    }
}
