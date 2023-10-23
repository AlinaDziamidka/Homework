package com.itacademy.brest.Tasks_book_JC_2022_arrays;

import java.util.Random;

public class Task20 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


//    Создайте переменную для массива из 10 элементов (другим способом).
//        Заполните его произвольными значениями целочисленного типа и выведите на
//        экран элементы, стоящие на четных позициях.
