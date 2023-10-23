package com.itacademy.brest.Tasks_book_JC_2022_cycles;

public class Task17 {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        System.out.println("Числа, которые делятся на 7 в заданом диапазоне: ");

        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println("Hope!");
            }
        }
    }
}
