package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму (целое число): ");
        int money = scanner.nextInt();
        int lastNum = money % 10;

        if (isTrue(money)) {
            switch (lastNum) {
                case 1 -> {
                    System.out.println(money + " рубль");
                }
                case 2, 3, 4 -> {
                    System.out.println(money + " рубля");
                }
                default -> {
                    System.out.println(money + " рублей");
                }
            }
        } else {
            System.out.println(money + " рублей");
        }
    }

    public static boolean isTrue(int num) {
        if (num % 100 / 10 == 1) {
            return false;
        }
        return true;
    }
}

