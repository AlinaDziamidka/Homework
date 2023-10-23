package com.itacademy.brest.Tasks_book_JC_2022_cycles;

public class Task13 {
    public static void main(String[] args) {

        long Factorial = 1;
        int num = 0;

        while (num < 11) {
            int num2 = 1;

            while (num2 <= num) {
                Factorial *= num2;
                num2++;
            }
            System.out.println("Факториал числа " + num + " равен " + Factorial);
            num++;
        }
    }
}
