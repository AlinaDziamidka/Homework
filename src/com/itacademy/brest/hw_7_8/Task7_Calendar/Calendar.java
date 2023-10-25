package com.itacademy.brest.hw_7_8.Task7_Calendar;

import java.util.Objects;

public class Calendar {


    private CalendarEvent[] calendarEvents;

    public Calendar(CalendarEvent[] calendarEvents) {
        this.calendarEvents = calendarEvents;
    }

    public CalendarEvent[] getCalendarEvents() {
        return calendarEvents;
    }

    public void setCalendarEvents(CalendarEvent[] calendarEvents) {
        this.calendarEvents = calendarEvents;
    }

    public void listALLCalendarEvents() {
        for (CalendarEvent calendarEvent : calendarEvents) {
            if (Objects.nonNull(calendarEvent)) {
                calendarEvent.getDetails();
            }
        }
    }

    public void addCalendarEvent(CalendarEvent calendarEvent) {
        for (int i = 0; i < calendarEvents.length; i++) {
            if (Objects.isNull(calendarEvents[i])) {
                calendarEvents[i] = calendarEvent;
                System.out.println(calendarEvent.getDescription() + " successfully added to Calendar");
                return;
            }
        }
    }

    public void findCalendarEventByID(CalendarEvent calendarEvent) {
        for (int i = 0; i < calendarEvents.length; i++) {
            CalendarEvent calendarEvent1 = calendarEvents[i];
            if (Objects.nonNull(calendarEvent1) && calendarEvent1.getId() == calendarEvent.getId()) {
                System.out.println(calendarEvent.getUser().getName() + ": ");
                calendarEvent.getDetails();
                return;
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