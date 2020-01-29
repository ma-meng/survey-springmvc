package com.ma.survey.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * created by <a href="mailto:18045142590@163.com" > mameng </a>
 */
public class Delivery {

    private String name;
    private String mobile;
    private String address;
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
