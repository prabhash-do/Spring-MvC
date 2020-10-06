package com.spring;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;

    private String gender;
    private String country;
    private LinkedHashMap<String,String> countryOptions;
    private String[] sports;

    Student(){
        countryOptions=new LinkedHashMap<>();
        countryOptions.put("ind","India");
        countryOptions.put("USA","USA");
        countryOptions.put("rsa","Russia");
        countryOptions.put("Br","Brazil");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getSports() {
        return sports;
    }

    public void setSports(String[] sports) {
        this.sports = sports;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}
