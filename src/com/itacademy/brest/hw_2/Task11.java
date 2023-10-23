package com.itacademy.brest.hw_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = a.nextDouble();

        System.out.print("Введите число 1, если хотите перевести C в F или введите число 2, если хотите перевести F в C: ");
        int number1 = a.nextInt();

        if (number1 == 1) {
            double F1 = ((number * 9 / 5) + 32);
            System.out.println(number + "C" + " равно " + F1 + "F");
        } else if (number1 == 2) {
            double C1 = ((number - 32) * 5) / 9;
            System.out.println(number + "F" + " равно " + C1 + "C");
        } else {
            System.out.println("введено неверное число");
        }
    }
}

