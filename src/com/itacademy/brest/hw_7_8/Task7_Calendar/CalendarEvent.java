package com.itacademy.brest.hw_7_8.Task7_Calendar;

import com.itacademy.brest.hw_7_8.Task5_College.Student;

import java.util.Objects;
import java.util.Random;

public class CalendarEvent {

    private String date; // form yyyy/mm/dd
    private String time; // form 6:30 pm
    private String description;
    private boolean isFinish = false;
    private User user;
    private static int id;

    public CalendarEvent(String date, String time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public CalendarEvent(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public void isFinishCalendarEvent() {
        isFinish = true;
        user.deleteCalendarEvent(this);
    }

    public void getDetails() {
        if (isFinish) {
            System.out.print("Finished event: ");
        }
        System.out.print("Date " + date + ", Time: " + time + ", Description: " + description);
        System.out.println();
    }

    public void addId() {
        ++id;
    }
}