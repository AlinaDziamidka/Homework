package com.itacademy.brest.Tasks_book_JC_2022_class_string;

public class TEST {

        public static void main(String[] args) {
            String inputString = "Brest,, - is the --- best city in?????? the world!";
            int punctuationCount = 0;

            for (char character : inputString.toCharArray()) {
                if (Character.isLetterOrDigit(character)) {
                    continue; // Пропустить буквы и цифры
                } else if (Character.isWhitespace(character)) {
                    continue; // Пропустить пробелы
                } else {
                    punctuationCount++;
                }
            }

            System.out.println("Общее количество знаков препинания: " + punctuationCount);
        }
    }

