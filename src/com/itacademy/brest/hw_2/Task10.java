package com.itacademy.brest.hw_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " является палиндромом");
        } else {
            System.out.println(number + " не является палиндромом.");
        }
    }
    public static boolean isPalindrome(int testNum) {
        String StrTestNum = String.valueOf(testNum);
        int length = StrTestNum.length();
        char[] allNumbers = StrTestNum.toCharArray();
        int lastIndex = --length;
        int firstIndex = 0;
        char firstTestNum = allNumbers[firstIndex];
        char lastTestNum = allNumbers[lastIndex];
        while (firstIndex < lastIndex) {
            if (firstTestNum != lastTestNum) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}


