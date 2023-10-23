package com.itacademy.brest.hw_3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " является палиндромом");
        } else {
            System.out.println(n + " не является палиндромом");
        }
    }

    public static boolean isPalindrome(int number) {

        String strNumber = String.valueOf(number);

        int length = strNumber.length();
        int lastIndex = length - 1;

        for (int i = 0; i < lastIndex; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(lastIndex)) {
                return false;
            }
            lastIndex--;
        }
        return true;
    }
}
