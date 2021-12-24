package com.covido.vaccine.dto;

import java.io.Serializable;

public class Person implements Serializable {

    private String mobile;
    private String aadhar;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "mobile='" + mobile + '\'' +
                ", aadhar='" + aadhar + '\'' +
                '}';
    }
}
