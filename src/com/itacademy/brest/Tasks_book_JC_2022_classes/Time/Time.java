package com.itacademy.brest.Tasks_book_JC_2022_classes.Time;

public class Time {

    private int sec;
    private int min;
    private int hours;

    public Time(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public Time(int allSec) {
        this.hours = allSec / 3600;
        this.min = allSec % 3600 / 60;
        this.sec = allSec % 3600 % 60;
    }

    public Time() {

    }

    public int countSec() {
        sec = hours * 3600 + min * 60 + sec;
        return sec;
    }

    public int compareTime(Time anotherTime) {
        int thisSec = this.countSec();
        int anotherSec = anotherTime.countSec();

        if (thisSec > anotherSec) {
            return 1;
        } else if (thisSec < anotherSec) {
            return 2;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        if (this.hours != 1) {
            return hours + " hours " +
                    +min + " minute " +
                    sec + " second";
        } else {
            return hours + " hour " +
                    +min + " minute " +
                    sec + " second";
        }
    }
}


