package com.itacademy.brest.Tasks_book_JC_2022_cycles;

public class Task16 {
    public static void main(String[] args) {

        int startNum = 50;
        int endNum = 70;
        int a = 0;

        while (startNum <= endNum) {

            boolean isPrime = true;

            if (startNum % 2 == 0) {
                isPrime = false;
            } else {
                for (int i = 3; i * i <= startNum; i++) {
                    if (startNum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                a += 1;
                if (a == 2) {
                    break;
                }
            }
            startNum++;
        }
        System.out.print("Второе простое число в заданом диапазоне равно " + startNum);
    }
}



