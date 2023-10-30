package com.itacademy.brest.hw_10_12.task1_classes_and_interfaces.person;

public class Person {

    private String name;
    private int age;

    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static class Address {

        public Address(String houseNumber, String street, String city) {
            this.houseNumber = houseNumber;
            this.street = street;
            this.city = city;
        }

        private String houseNumber;
        private String street;
        private String city;

        public String getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
        }

        public String getString() {
            return street;
        }

        public void setString(String string) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}