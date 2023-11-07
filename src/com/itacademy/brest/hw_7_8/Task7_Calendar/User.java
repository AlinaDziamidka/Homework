package com.itacademy.brest.hw_7_8.Task7_Calendar;

import java.util.Objects;

public class User {

    private String name;
    //usually we have unidirectional relationships. CalendarEvent contains user. Calendar contains CalendarEvent[] calendarEvents;
    //the calendar is responsible for managing events.
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

    //the calendar is responsible for managing events. addUserToCalendarEvent(CalendarEvent calendarEvent, User user)
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

    //the calendar is responsible for managing events. listActiveCalendarEvents(User user)
    public void listActiveCalendarEvents() {
        for (CalendarEvent calendarEvent : calendarEvents) {
            if (Objects.nonNull(calendarEvent)) {
                calendarEvent.getDetails();
            }
        }
    }

    //we must also have id for the user
    //the calendar is responsible for managing events. deleteCalendarEvent(CalendarEvent calendarEvent, User user)
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