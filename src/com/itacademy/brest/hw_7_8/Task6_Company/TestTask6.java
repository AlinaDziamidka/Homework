package com.itacademy.brest.hw_7_8.Task6_Company;

import java.util.Objects;

public class TestTask6 {
    public static void main(String[] args) {

        Company company = new Company(new Employee[10], new Department[5]);

        Department department1 = new Department(new Employee[5], "Accounting");
        Department department2 = new Department(new Employee[5], "Sales");
        Department department3 = new Department(new Employee[5], "Security");

        company.addDepartments(department1);
        company.addDepartments(department2);
        company.addDepartments(department3);

        Employee employee1 = new Employee("Elena", 123, "Сhief accountant", 5000);
        Employee employee2 = new Employee("Olga", 1234, "accountant", 4000);
        Employee employee3 = new Employee("Aleksandr", 321, "Sales chief", 4000);
        Employee employee4 = new Employee("Denis", 4321, "Sales specialist", 3500);
        Employee employee5 = new Employee("Gleb", 54321, "Clients specialist", 3000);
        Employee employee6 = new Employee("Egor", 789, "Day watchman", 2500);
        Employee employee7 = new Employee("Pavel", 987, "Night watchman", 2500);

        System.out.println();

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);
        department2.addEmployee(employee5);
        department3.addEmployee(employee6);
        department3.addEmployee(employee7);

        System.out.println();

        int generalSalaryDepartment1 = 0;
        int generalSalaryDepartment2 = 0;
        int generalSalaryDepartment3 = 0;
        int temp = generalSalaryDepartment1;

        for (Employee employee : department1.getEmployees()) {
            if (Objects.nonNull(employee)) {
                company.addEmployee(employee);
                generalSalaryDepartment1 += employee.getSalary();
            }
        }

        for (Employee employee : department2.getEmployees()) {
            if (Objects.nonNull(employee)) {
                company.addEmployee(employee);
                generalSalaryDepartment2 += employee.getSalary();
            }
        }

        if (temp < generalSalaryDepartment2) {
            temp = generalSalaryDepartment2;
        }


        for (Employee employee : department3.getEmployees()) {
            if (Objects.nonNull(employee)) {
                company.addEmployee(employee);
                generalSalaryDepartment3 += employee.getSalary();
            }
        }

        if (temp < generalSalaryDepartment3) {
            temp = generalSalaryDepartment3;
        }

        System.out.println();

        int generalSalary = 0;

        for (Employee employee : company.getEmployees()) {
            if (Objects.nonNull(employee)) {
                generalSalary += employee.getSalary();
            }
        }

        System.out.println("General company salary: " + generalSalary);
        System.out.println();
        System.out.println("General Accounting department salary: " + generalSalaryDepartment1);
        System.out.println("General Sales department salary: " + generalSalaryDepartment2);
        System.out.println("General Security department salary: " + generalSalaryDepartment3);

        System.out.println();

        if (temp > (generalSalary - temp)) {
            System.out.println("Need optimisation");
        }
    }
}