package com.itacademy.brest.companyTask.staff;

import com.itacademy.brest.companyTask.Countable;
import com.itacademy.brest.companyTask.report.ReportFactory;
import com.itacademy.brest.companyTask.report.Reportable;
import com.itacademy.brest.companyTask.staffAtributes.AccountantStatus;
import com.itacademy.brest.companyTask.staffAtributes.People;
import com.itacademy.brest.companyTask.staffAtributes.Title;

import java.lang.annotation.Repeatable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Accountant extends Staff implements Countable, Reportable {
    public Accountant(People people, Title title, AccountantStatus accountantStatus) {
        super(people, title);
    }

    private Map<Staff, Double> salaryReportByProject;
    private AccountantStatus accountantStatus;
    private ReportFactory reportFactory;


    @Override
    public String report() {
        Map<Staff, Double> salaryReport = new HashMap<>();
        reportFactory.getCompany().getStaffList().stream().
                collect(Collectors.toMap(Function.identity(), this::count));
        return salaryReport.toString();
    }

    @Override
    double getSalaryRate() {
        return 1;
    }

    public Map<Staff, Double> getSalaryReportByProject() {
        return salaryReportByProject;
    }

    public void setSalaryReportByProject(Map<Staff, Double> salaryReportByProject) {
        this.salaryReportByProject = salaryReportByProject;
    }

    public AccountantStatus getAccountantStatus() {
        return accountantStatus;
    }

    public void setAccountantStatus(AccountantStatus accountantStatus) {
        this.accountantStatus = accountantStatus;
    }

    @Override
    public double count(Staff staff) {
        double salary = staff.getSalaryRate() * staff.getWorkingHours() * staff.getSalaryPerHour();
        return salary;
    }

    public boolean isHeadOfDepartment (){
        if (this.accountantStatus.equals(AccountantStatus.HEAD_OF_DEPARTMENT)){
            return true;
        }
        return false;
    }

}
