package com.itacademy.brest.hw_5;

import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(201) - 100;
            arr[i] = num;
        }

        int temp = 0;
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int maxSum = -100 * arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
                temp = i + 1;
            }

            if (sum > maxSum) {
                maxSum = sum;
                startIndex = temp;
                endIndex = i;
            }
        }

        System.out.println("Наибольшая последовательность в массиве: ");

        for (int i = startIndex; i <= endIndex; i++) {
           System.out.print(arr[i] + " ");
        }

    }
}