package com.itacademy.brest.companyTask.staff;

import com.itacademy.brest.companyTask.report.Reportable;
import com.itacademy.brest.companyTask.staffAtributes.People;
import com.itacademy.brest.companyTask.staffAtributes.Title;

public class Lead extends Staff  {
    @Override
    double getSalaryRate() {
        return 2;
    }

    public Lead(People people, Title title) {
        super(people, title);
    }



    public Object getReport(Object title) {
        return null;
    }
}
