package com.itacademy.brest.hw_7_8.Task7_Calendar;

import com.itacademy.brest.hw_7_8.Task5_College.Student;

import java.util.Objects;
import java.util.Random;

public class CalendarEvent {

    private String date; // form yyyy/mm/dd
    private String time; // form 6:30 pm
    private String description;
    private int id;

    private Random random = new Random();

    public CalendarEvent(String date, String time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getDetails() {
        System.out.print("Date " + date + ", Time: " + time + ", Description " + description);
        System.out.println();
    }

    public void addId() {
        id = random.nextInt(10000);
    }

}


//
//CalendarEvent (Событие в календаре) - класс, представляющий событие с атрибутами,
//        такими как дата, время и описание.