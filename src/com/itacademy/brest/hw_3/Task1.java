package com.itacademy.brest.hw_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    }
}
