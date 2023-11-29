package com.itacademy.brest.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestNullPointerException {
    public static void main(String[] args) {

        People people1 = new People("Alina", new People.Address[2]);
        People people2 = new People("Denis", new People.Address[2]);

        City city = new City(new ArrayList<>());
        city.addPeople(people1);
        city.addPeople(people2);
        city.addPeople(null);

        city.changeNameByName("Ali");

        people1.addAddress("Brest");
        people1.addAddress("Gomel");
        people1.addAddress("Pinsk");
        people2.addAddress("Minsk");




    }
    }

