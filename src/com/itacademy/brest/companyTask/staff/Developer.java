package com.itacademy.brest.companyTask.staff;

import com.itacademy.brest.companyTask.staffAtributes.People;
import com.itacademy.brest.companyTask.staffAtributes.Title;

public class Developer extends Staff {
    @Override
    double getSalaryRate() {
        return 1;
    }

    public Developer(People people, Title title) {
        super(people, title);
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
