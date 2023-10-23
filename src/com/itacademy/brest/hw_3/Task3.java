package com.itacademy.brest.hw_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Введите третье число: ");
        double num3 = scanner.nextDouble();

        double temp = 0;
        double max = 0;
        double middle = 0;
        double min = 0;

        if (num1 >= temp) {
            temp = num1;
        }
        if (num2 >= temp) {
            temp = num2;
        }
        if (num3 >= temp) {
            temp = num3;
        }
        if (num1 == temp) {
            max = num1;
            if (num2 >= num3) {
                middle = num2;
                min = num3;
            } else if (num3 >= num2) {
                middle = num3;
                min = num2;
            }
        } else if (num2 == temp) {
            max = num2;
            if (num1 >= num3) {
                middle = num1;
                min = num3;
            } else if (num3 >= num1) {
                middle = num3;
                min = num2;
            }
        } else if (num3 == temp) {
            max = num3;
            if (num1 >= num2) {
                middle = num1;
                min = num2;
            } else if (num2 >= num1) {
                middle = num2;
                min = num1;
            }
        }
        System.out.println(max + " " + middle + " " + min);
    }
}
