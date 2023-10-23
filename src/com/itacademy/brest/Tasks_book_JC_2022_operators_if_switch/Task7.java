package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        if (isMethod(n)) {
            System.out.println("The last number of " + n + " is 7");
        } else {
            System.out.println("The last number of " + n + " isn't 7");
        }
    }

    public static boolean isMethod(int num) {
        if (num % 10 == 7) {
            return true;
        }
        return false;
    }
}



