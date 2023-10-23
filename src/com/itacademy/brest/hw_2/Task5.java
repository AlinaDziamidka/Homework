package com.itacademy.brest.hw_2;

public class Task5 {
    public static void main(String[] args) {
        int a = 1235;
        int a_num4 = a % 10;

        int b = 12358;
        int b_num5 = b % 10;

        if (a_num4 % 2 == 0){
            System.out.println("Последняя цифра числа 1235 четная");
        }
        else {
            System.out.println("Последняя цифра числа 1235 нечетная");
        }
        if (b_num5 % 2 == 0) {
            System.out.println("Последняя цифра числа 12358 четная");
        }
        else {
            System.out.println("Последняя цифра числа 12358 нечетная");
        }
    }
}
