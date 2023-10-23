package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the day of the week: ");
        int day = scanner.nextInt();

        String[] timetable = {"Doctor", "Swimming pool", "Grandma's birthday", "Hardworking", "Business trip", "Friend's wedding", "Parents day"};

        if (day <= 7 && day >= 1) {
            System.out.println(timetable[day - 1]);
        } else {
            System.out.println("Error. Entered invalid number.");
        }
    }
}
