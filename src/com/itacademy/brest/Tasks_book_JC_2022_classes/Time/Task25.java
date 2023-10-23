package com.itacademy.brest.Tasks_book_JC_2022_classes.Time;

public class Task25 {
    public static void main(String[] args) {

        Time time1 = new Time(1, 20, 30);
        Time time2 = new Time(3, 15, 3);

        System.out.println("Total seconds in " + time1.toString() + ": " + time1.countSec());
        System.out.println("Total seconds in " + time2.toString() + ": " + time2.countSec());

        switch (time1.compareTime(time2)) {
            case 1 -> System.out.println(time1.toString() + " more than " + time2.toString());
            case 2 -> System.out.println(time1.toString() + " less than " + time2.toString());
            case 3 -> System.out.println(time1.toString() + " equals " + time2.toString());
        }
    }
}
