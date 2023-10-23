package com.itacademy.brest.Tasks_book_JC_2022_cycles;

public class Task14 {

    public static long findProduct(int start, int end) {
        long product = 1;
        do {
            product *= start;
            start++;
        }
        while (start <= end);
        return product;
    }

    public static void main(String[] args) {

        int startNum = 1;
        int endNum = 25;

        System.out.println("Произведение чисел от " + startNum + " до " + endNum + " равно " + findProduct(startNum, endNum));
    }
}
