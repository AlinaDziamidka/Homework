package com.itacademy.brest.hw_7_8.Task7_Calendar;

import java.util.Objects;

public class User {

    private String name;

    private CalendarEvent[] calendarEvents;

    public User(String name, CalendarEvent[] calendarEvents) {
        this.name = name;
        this.calendarEvents = calendarEvents;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CalendarEvent[] getCalendarEvents() {
        return calendarEvents;
    }

    public void setCalendarEvents(CalendarEvent[] calendarEvents) {
        this.calendarEvents = calendarEvents;
    }

    public void addCalendarEvent(CalendarEvent calendarEvent) {
        for (int i = 0; i < calendarEvents.length; i++) {
            if (Objects.isNull(calendarEvents[i])) {
                calendarEvents[i] = calendarEvent;
                calendarEvent.addId();
                calendarEvent.setUser(this);
                System.out.println(calendarEvent.getDescription() + " successfully added");
                return;
            }
        }
    }

    public void listActiveCalendarEvents() {
        for (CalendarEvent calendarEvent : calendarEvents) {
            if (Objects.nonNull(calendarEvent)) {
                calendarEvent.getDetails();
            }
        }
    }

    public void deleteCalendarEvent(CalendarEvent calendarEvent) {
        for (int i = 0; i < calendarEvents.length; i++) {
            if (Objects.nonNull(calendarEvents[i]) && calendarEvents[i].getId() == calendarEvent.getId()) {
                calendarEvents[i] = null;
                System.out.println(calendarEvent.getDescription() + " successfully deleted");
                return;
            }
        }
    }
}