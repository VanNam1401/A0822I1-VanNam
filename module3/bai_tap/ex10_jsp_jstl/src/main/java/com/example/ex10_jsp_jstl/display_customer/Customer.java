package com.example.ex10_jsp_jstl.display_customer;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private String name;
//    private LocalDate dayBirth;
    private Date dayBirth;
    private String address;
    private String pathImage;

    public Customer(String name, Date dayBirth, String address, String pathImage) {
        this.name = name;
        this.dayBirth = dayBirth;
        this.address = address;
        this.pathImage = pathImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Date dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}
