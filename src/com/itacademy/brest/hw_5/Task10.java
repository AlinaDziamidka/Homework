package com.itacademy.brest.hw_5;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество столбцов массива: ");
        int n1 = scanner.nextInt();

        System.out.println("Введите количество строк массива: ");
        int n2 = scanner.nextInt();

        int[][] matrix = new int[n1][n2];
        int max = matrix[0][0];

        Random random = new Random();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                int num = random.nextInt(99);
                matrix[i][j] = num;
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент заданного массива равен: " + max);
    }
}



