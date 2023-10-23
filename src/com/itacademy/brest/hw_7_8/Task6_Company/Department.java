package com.itacademy.brest.hw_7_8.Task6_Company;

import java.util.Objects;

public class Department {

    private Employee[] employees;

    private String name;

    public Department(Employee[] employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.isNull(employees[i])) {
                employees[i] = employee;
                System.out.println(employee.getName() + " successfully added to " + this.getName());
                return;
            }
        }
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            if (Objects.nonNull(employee)) {
                System.out.print(employee + " ");
            }
        }
    }
}