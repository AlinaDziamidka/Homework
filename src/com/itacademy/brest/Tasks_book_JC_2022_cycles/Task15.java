package com.itacademy.brest.Tasks_book_JC_2022_cycles;

public class Task15 {

    public static int findSum(long n) {

        int sum = 0;

        do {
            sum += n % 10;
            n = n / 10;
        }
        while (n != 0);
        return sum;
    }

    public static void main(String[] args) {

        long num = 7893823445L;

        System.out.println("Сумма цифр числа " + num + " равна " + findSum(num));
    }
}
