package com.itacademy.brest.hw17;

public class Client {

    private String name;
    private String surname;
    private int id;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientInformation() {
        return "Name: " + this.name + ", Surname: " + this.surname + ", id: " + this.id + "; ";
    }
}
