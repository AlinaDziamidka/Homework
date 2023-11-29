package com.itacademy.brest.Test;

import java.util.Objects;

public class People {
    private String name;
    private int cityIndex;
    private Address[] addresses;

    public class Address {
        private String city;


        public Address(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public People(String name, Address[] addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityIndex() {
        return cityIndex;
    }

    public void setCityIndex(int cityIndex) {
        this.cityIndex = cityIndex;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public void addAddress(String city) {
        try {
            Address address = new Address(city);
            addresses[cityIndex] = address;
            cityIndex++;
        } catch (Exception e) {
            System.out.println("/IndexOutOfBoundsException");
        }
    }
}
