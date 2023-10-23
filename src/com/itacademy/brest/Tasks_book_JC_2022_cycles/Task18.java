package com.itacademy.brest.Tasks_book_JC_2022_cycles;

import java.util.Scanner;

public class Task18 {

    public static void isPrint1(long n) {

        int divisor = 1;

        while (n / divisor >= 10) {
            divisor *= 10;
        }
        long number = n / divisor;
        System.out.print(number + " ");
        n = n % divisor;
        divisor = divisor / 10;

        while (divisor > 0) {
            int i = 0;
            while (i < 3 && divisor > 0) {
                number = n / divisor;
                System.out.print(number);
                n = n % divisor;
                divisor = divisor / 10;
                i++;
            }
            System.out.print(" ");
        }
    }

    public static void isPrint2(long n) {

        int divisor = 1;

        while (n / divisor >= 10) {
            divisor *= 10;
        }

        long number = 0;

        for (int i = 0; i < 2; i++) {
            number = n / divisor;
            System.out.print(number);
            n = n % divisor;
            divisor = divisor / 10;
        }

        System.out.print(" ");

        while (divisor > 0) {
            int i = 0;
            while (i < 3 && divisor > 0) {
                number = n / divisor;
                System.out.print(number);
                n = n % divisor;
                divisor = divisor / 10;
                i++;
            }
            System.out.print(" ");
        }
    }


    public static void isPrint3(long n) {

        int divisor = 1;

        while (n / divisor >= 10) {
            divisor *= 10;
        }
        while (divisor > 0) {
            int i = 0;
            while (i < 3 && divisor > 0) {
                long number = n / divisor;
                System.out.print(number);
                n = n % divisor;
                divisor = divisor / 10;
                i++;
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        long num = scanner.nextLong();

        String strNum = String.valueOf(num);
        int lenght = strNum.length();

        if (lenght % 3 == 0) {
            isPrint3(num);
        } else if (lenght % 3 == 1) {
            isPrint1(num);
        } else if (lenght % 3 == 2) {
            isPrint2(num);
        }
    }
}




