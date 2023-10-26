package com.itacademy.brest.Tasks_book_JC_2022_class_string;

public class Task32 {
    public static void main(String[] args) {

        String text = "aaabbbccc";
        String text1 = "aaabbbccc";
        StringBuilder text2 = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            text1 = text1.concat(text);
            System.out.print(text1 + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 1000000; i++) {
            text2.append(text);
            System.out.print(text2 + " ");
        }
    }
}



//    Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
//        один с помощью оператора сложения и String, а другой с помощью StringBuilder и
//        метода append. Сравните скорость их выполнения. Выведите сравнение на экран