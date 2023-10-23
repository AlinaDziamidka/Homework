package com.itacademy.brest.hw_2;

public class Task2 {
    public static void main(String[] args) {
        int abcd = 1235;
        int ab = abcd / 100;
        int cd = abcd % 100;

        System.out.println("Cумма цифр ab + cd числа abcd, где число abcd - " + abcd + " = " + (ab + cd));
    }
}
