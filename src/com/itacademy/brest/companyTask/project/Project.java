package com.itacademy.brest.companyTask.project;

import com.itacademy.brest.companyTask.exception.NoPermissionsException;
import com.itacademy.brest.companyTask.staff.Head;
import com.itacademy.brest.companyTask.staff.Staff;
import com.itacademy.brest.companyTask.staffAtributes.Title;

import java.util.ArrayList;
import java.util.List;



public class Project {
    private String name;
    private List<Integer> staffIDs = new ArrayList<>();

    private Head head;

    public Project(String name, List<Integer> staffIDs) {
        this.name = name;
        this.staffIDs = staffIDs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getStaffIDs() {
        return staffIDs;
    }

    public void setStaffIDs(List<Integer> staffIDs) {
        this.staffIDs = staffIDs;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void addToProject(Staff staff) throws NoPermissionsException {
        try {
            if (isAllowed()) {
                try {
                    if (staff.getTitle().equals(Title.DEVELOPER) || staff.getTitle().equals(Title.LEAD)) {
                    }
                    staffIDs.add(staff.getId());
                }
                catch (Exception inThreadException) {
                    System.out.println("/only lead or developer");
                }
            }
        } catch (Exception inThreadException) {
            System.out.println("/no access to method");
        }
        }

    private boolean isAllowed() {
        return Thread.currentThread().getName().equals("Staff");
    }
}


