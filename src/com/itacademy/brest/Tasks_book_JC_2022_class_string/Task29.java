package com.itacademy.brest.Tasks_book_JC_2022_class_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter text: ");
//        String text = scanner.nextLine();

        String text = "Brest is the best city in the world";

        Pattern pattern = Pattern.compile(" +[a-zA-Z]");
        Matcher matcher = pattern.matcher(text);



    }
}


//    Введите с клавиатуры текст. Выведите на экран текст, составленный из
//        последних букв всех слов из исходного текста.
