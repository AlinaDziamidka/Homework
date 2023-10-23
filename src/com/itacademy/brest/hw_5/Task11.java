package com.itacademy.brest.hw_5;

import java.util.Random;
import java.util.Scanner;

public class Task11 {

    public static boolean isCorrect(int n, int a) {
        if (n > a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int num = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Угадайте загаданное число: ");
        int answer = scanner.nextInt();

        while (num != answer) {
            if (isCorrect(num, answer)) {
                System.out.println("Больше");
                answer = scanner.nextInt();
            } else {
                System.out.println("Меньше");
                answer = scanner.nextInt();
            }
        }
        System.out.println("Верно");
    }
}