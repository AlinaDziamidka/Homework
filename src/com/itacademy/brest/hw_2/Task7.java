package com.itacademy.brest.hw_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = number.nextInt();

        boolean isPrimeNumber = false;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }
        if (isPrimeNumber) {
            System.out.println("Число " + a + " не является простым");
        } else {
            System.out.println("Число " + a + " является простым");
        }
    }
}



