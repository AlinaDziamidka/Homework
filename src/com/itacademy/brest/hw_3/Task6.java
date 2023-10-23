package com.itacademy.brest.hw_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = scanner.nextInt();

        int isFactorial = 1;

        for (int i = 1; i <= n; i++) {
            isFactorial *= i;
        }
        System.out.println(n + "! = " + isFactorial);
    }
}
