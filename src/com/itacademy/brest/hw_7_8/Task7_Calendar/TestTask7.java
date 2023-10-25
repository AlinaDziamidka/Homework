package com.itacademy.brest.hw_7_8.Task7_Calendar;

public class TestTask7 {
    public static void main(String[] args) {

        Calendar calendar = new Calendar(new CalendarEvent[10]);

        while (true) {

            User user1 = new User("Alina", new CalendarEvent[5]);
            User user2 = new User("Denis", new CalendarEvent[5]);

            CalendarEvent calendarEvent1 = new CalendarEvent("2023/10/25", "8:00 am", "Alina's breakfast");
            user1.addCalendarEvent(calendarEvent1);
            calendar.addCalendarEvent(calendarEvent1);

            CalendarEvent calendarEvent2 = new CalendarEvent("2023/10/25", "1:00 pm", "Alina's lunch");
            user1.addCalendarEvent(calendarEvent2);
            calendar.addCalendarEvent(calendarEvent2);

            CalendarEvent calendarEvent3 = new CalendarEvent("2023/10/25", "9:00 am", "Denis's breakfast");
            user2.addCalendarEvent(calendarEvent3);
            calendar.addCalendarEvent(calendarEvent3);

            CalendarEvent calendarEvent4 = new CalendarEvent("2023/10/25", "2:00 pm", "Denis's lunch");
            user2.addCalendarEvent(calendarEvent4);
            calendar.addCalendarEvent(calendarEvent4);

            System.out.println();

            user1.listActiveCalendarEvents();
            user2.listActiveCalendarEvents();

            System.out.println();

            calendar.listALLCalendarEvents();

            System.out.println();

            user1.deleteCalendarEvent(calendarEvent1);
            calendar.deleteCalendarEvent(calendarEvent1);
            calendarEvent3.isFinishCalendarEvent();

            System.out.println();

            user1.listActiveCalendarEvents();
            user2.listActiveCalendarEvents();

            System.out.println();

            calendar.listALLCalendarEvents();

            System.out.println();

            calendar.findCalendarEventByID(calendarEvent3);

            break;
        }
    }
}