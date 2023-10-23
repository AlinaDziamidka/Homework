package com.itacademy.brest.hw_2;

public class Task3 {
    public static void main(String[] args) {
        int a = 3681;
        int num4 = a % 10;
        int num3 = a / 10 % 10;
        int num2 = a / 100 % 10;
        int num1 = a / 1000;
        int max1 = Math.max(num4, num3);
        int max2 = Math.max(num2, num1);
        int max3 = Math.max(max2, max1);

        if (max3 % 2 == 0){
            System.out.println("четное");
        }
        else {
            System.out.println("нечетное");
        }
    }
}







