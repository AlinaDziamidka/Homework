package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();


        Pattern pattern = Pattern.compile("<p[^>]*>");
        Matcher matcher = pattern.matcher(text);

        String text1 = matcher.replaceAll("<p>");

        System.out.println(text1);
    }
}

//    Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
//        всех тегов абзацев, в том числе тех, у которых есть параметры, например, <p
//        id=”p1”>, и замену их на простые теги абзацев <p>. Результат работы метода
//        выведите на экран.