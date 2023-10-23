package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int d = scanner.nextInt();

        System.out.print("Введите порядковый номер месяца: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int lastDay = 0;
        int nextD = d + 1;
        int nextMonth = month + 1;
        int nextYear = year + 1;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                lastDay = 31;
            }
            case 4, 6, 9, 11 -> {
                lastDay = 30;
            }
            case 2 -> {
                if (isLeapYear(year)) {
                    lastDay = 28;
                } else {
                    lastDay = 29;
                }
            }
        }

        if (d <= lastDay && month <= 12) {
            if (d == lastDay) {
                if (month == 12) {
                    System.out.println("1 " + "1 " + nextYear);
                } else {
                    System.out.println("1 " + nextMonth + " " + year);
                }
            } else {
                System.out.println(nextD + " " + month + " " + year);
            }
        } else {
            System.out.println("Ошибка. Введен неверный день или месяц");
        }
    }

    public static boolean isLeapYear(int num) {
        if (num % 400 == 0) {
            return false;
        } else if (num % 100 == 0) {
            return true;
        } else if (num % 4 == 0) {
            return false;
        }
        return true;
    }
}

