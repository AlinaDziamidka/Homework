package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        int count = 0;

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

    }
}


//    Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
//        знаки препинания. Подсчитать общее их количество.


