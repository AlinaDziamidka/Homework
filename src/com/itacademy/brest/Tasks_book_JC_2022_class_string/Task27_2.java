package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.Scanner;

public class Task27_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        int count = 0;

        for (char character : text.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                continue;
            } else if (Character.isWhitespace(character)) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
