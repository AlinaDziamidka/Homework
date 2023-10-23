package com.itacademy.brest.hw_2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = number.nextInt();

        String even = "введенное число является четным";
        String odd = "введенное число является нечетным";

        String b = (a % 2 == 0) ? even : odd;
        System.out.println(b);
    }
}
