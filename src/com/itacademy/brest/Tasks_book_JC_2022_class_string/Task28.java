package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        text = text.trim();
        String arr[] = text.split(" +");
        System.out.println(arr.length);
    }
}


//    Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
//        слова могут разделяться несколькими пробелами, в начале и конце текста также
//        могут быть пробелы, но могут и отсутствовать.