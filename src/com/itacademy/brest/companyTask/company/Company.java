package com.itacademy.brest.companyTask.company;

import com.itacademy.brest.companyTask.project.Project;
import com.itacademy.brest.companyTask.staff.Accountant;
import com.itacademy.brest.companyTask.staff.Staff;
import com.itacademy.brest.companyTask.staffAtributes.AccountData;
import com.itacademy.brest.companyTask.staffAtributes.AccountantStatus;
import com.itacademy.brest.companyTask.staffAtributes.Title;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private List<Staff> staffList;
    private List<Project> projects;

    public Company(List<Staff> staffList, List<Project> projects) {
        this.staffList = staffList;
        this.projects = projects;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public boolean findStaff(Staff staff) {
        for (Staff staff1 : staffList) {
            try {
                if (staff.equals(staff1)) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("/ not found");
            }
        }
        return true;
    }

    public void addStaff(Staff... newStaff) {
        staffList.addAll(List.of(newStaff));
    }

    public Staff getStaff(Title title) {
        return staffList.stream()
                .filter(staff -> staff.getTitle() == title)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("There is no staff with this title"));

    }


//    }

}
