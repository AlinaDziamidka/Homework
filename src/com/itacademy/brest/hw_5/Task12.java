package com.itacademy.brest.hw_5;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(100);
            arr[i] = num;
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (sum > 50) {
            System.out.println("Сумма больше 50");
        } else if (sum == 50) {
            System.out.println("Сумма равна 50");
        } else {
            System.out.println("Сумма меньше 50");
        }
    }
}
