package com.itacademy.brest.companyTask.report;

import com.itacademy.brest.companyTask.company.Company;
import com.itacademy.brest.companyTask.staff.Accountant;
import com.itacademy.brest.companyTask.staff.Head;
import com.itacademy.brest.companyTask.staff.Staff;
import com.itacademy.brest.companyTask.staffAtributes.AccountantStatus;
import com.itacademy.brest.companyTask.staffAtributes.Title;

import java.util.List;

public class ReportFactory {

    private final Company company;

    public ReportFactory(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public String getReport(Title title) {
        Staff staff = company.getStaff(title);
        if (staff instanceof Reportable) {
            Reportable reportable = (Reportable) staff;
            return reportable.report();
        }
        throw new RuntimeException("No reports for this title");
    }

}
