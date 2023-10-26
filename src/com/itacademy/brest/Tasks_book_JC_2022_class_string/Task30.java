package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {

        String text = "1A45F0D 1A45F0D";
        Pattern pattern = Pattern.compile("0x[0-9A-Fa-f]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

//    Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
//        шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
//        выражений. Результат работы метода выведите на экран.