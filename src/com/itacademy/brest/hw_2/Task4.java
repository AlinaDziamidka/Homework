package com.itacademy.brest.hw_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое пятизначное число: ");
        int a = number.nextInt();

        if (a <= 99999 && a > 9999) {
            int num3 = a / 100 % 10;
            System.out.println("Третяя цифра числа " + a + " равна\n" + num3);
        } else {
            System.out.println("Введено не пятизначное число");
        }
    }
}
