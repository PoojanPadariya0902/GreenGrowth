package com.example.greengrowth;

public class spinneritem {

    String lab_name;
    String lab_type;
    String gov_funding;
    String mobile;

    public spinneritem() {}

    public spinneritem(String lab_name, String lab_type, String gov_funding, String mobile) {
        this.lab_name = lab_name;
        this.lab_type = lab_type;
        this.gov_funding = gov_funding;
        this.mobile = mobile;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public String getLab_type() {
        return lab_type;
    }

    public void setLab_type(String lab_type) {
        this.lab_type = lab_type;
    }

    public String getGov_funding() {
        return gov_funding;
    }

    public void setGov_funding(String gov_funding) {
        this.gov_funding = gov_funding;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
