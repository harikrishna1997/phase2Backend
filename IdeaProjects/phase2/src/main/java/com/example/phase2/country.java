package com.example.phase2;


import com.fasterxml.jackson.annotation.JsonProperty;

public class country {
    private String country_code;
    private  String country_name;


    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }


    @Override
    public String toString() {
        return  country_code;

    }
}
