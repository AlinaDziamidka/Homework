package com.itacademy.brest.hw_7_8.Task6_Company;

import java.util.Objects;

public class Company {

    private Employee[] employees;

    private Department [] departments;

    public Company(Employee[] employees, Department[] departments) {
        this.employees = employees;
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.isNull(employees[i])) {
                employees[i] = employee;
                System.out.println(employee.getName() + " successfully added to the company");
                return;
            }
        }
    }

    public void addDepartments(Department department) {
        for (int i = 0; i < departments.length; i++) {
            if (Objects.isNull(departments[i])) {
                departments[i] = department;
                System.out.println(department.getName() + " successfully added");
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