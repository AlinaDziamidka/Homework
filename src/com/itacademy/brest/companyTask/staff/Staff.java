package com.itacademy.brest.companyTask.staff;

import com.itacademy.brest.companyTask.exception.NoPermissionsException;
import com.itacademy.brest.companyTask.project.Project;
import com.itacademy.brest.companyTask.staffAtributes.AccountData;
import com.itacademy.brest.companyTask.staffAtributes.People;
import com.itacademy.brest.companyTask.staffAtributes.Title;

public abstract class Staff {

    private Integer workingHours;
    private static int id;
    private Title title;
    private People people;
    private AccountData accountData;

    public Integer getWorkingHours() {
        return workingHours;
    }

    abstract double getSalaryRate ();

    public Staff (People people, Title title) {
        this.title = title;
        this.people = people;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public AccountData getAccountData() {
        return accountData;
    }

    public void setAccountData(AccountData accountData) {
        this.accountData = accountData;
    }

    public void addId() {
        ++id;
    }

    public void addStaffToProject(Project project, Staff staff) throws NoPermissionsException {
        if (this.getId() == (project.getHead().getId())) {
            project.addToProject(staff);
        } else {
            throw new NoPermissionsException("You have no rights to add stuff to this project");
        }
    }

    public double getSalaryPerHour(){
        return this.getAccountData().getSalaryPerHour();
    }

}
