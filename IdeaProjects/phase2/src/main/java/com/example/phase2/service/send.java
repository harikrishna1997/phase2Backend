package com.example.phase2.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class send {

    public HashMap<String, String> sendRequest(Boolean booleanVal) {

        HashMap<String, String> map = new HashMap<>();
        String value = null;
       // System.out.println(booleanVal);
        if (booleanVal == true) {
            value = "You belong to one of these countries";

        }
        if (booleanVal==null){
            value="Please select one or many countries";
        }
        if (booleanVal==false) {
            value = "You do not belong to any of these countries";
        }
        map.put("boolean_value", value);
        return map;
    }
}
