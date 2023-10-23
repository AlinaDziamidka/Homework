package com.itacademy.brest.hw_5;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов в первом  массиве: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Введите количество элементов во втором  массиве: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        Random random = new Random();

        for (int i = 0; i < n1; i++) {
            int num = random.nextInt(100);
            arr1[i] = num;
            i++;
        }

        for (int i = 0; i < n2; i++) {
            int num = random.nextInt(100);
            arr2[i] = num;
            i++;
        }

        for (int i = 0; i < n2; i++) {
            if (arr2[i] % 2 == 1 && arr1[i] % 2 == 0) {
                arr1[i] = arr2[i];
            }
        }

        if (n1 > n2) {
            int indexArr1 = n2;
            for (int i = indexArr1; i < n1; i++) {
                arr1[0] += arr1[i];
            }
        }

        for (int i = 0; i < n1; i++) {
            System.out.println(arr1[i]);
        }
    }
}
