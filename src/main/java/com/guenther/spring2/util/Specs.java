package com.guenther.spring2.util;

/**
 * Created by DELL on 8/29/2017.
 */
public class Specs {
    private String address;
    private String company;
    private String city;

    public Specs(String address, String company, String city, String state, String weight) {
        this.address = address;
        this.company = company;
        this.city = city;
        this.state = state;
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    private String state;
    private String weight;

}
