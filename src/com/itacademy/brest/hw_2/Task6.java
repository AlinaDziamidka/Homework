package com.itacademy.brest.hw_2;

public class Task6 {
    public static void main(String[] args) {
        int a = 123;
        int num3 = a % 10;
        int num2 = a / 10 % 10;
        int num1 = a / 100;

        double avg = (num1 + num2 + num3) / 3D;

        System.out.println("Среднее арифметическое цифр числа " + a + " равно " + avg);
    }
}
