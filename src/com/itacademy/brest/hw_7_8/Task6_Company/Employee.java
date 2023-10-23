package com.itacademy.brest.hw_7_8.Task6_Company;

public class Employee {

    private String name;
    private int id;
    private String position;
    private int salary;

    public Employee(String name, int id, String position, int salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Id: " + id + ", Position " + position + ", Salary: " + salary);
    }
}




