package com.itacademy.brest.Tasks_book_JC_2022_arrays;

import java.util.Random;

public class Task21 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int max = arr[0];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }



//    Создайте переменную для массива из 10 элементов. Заполните его
//        произвольными значениями целочисленного типа. Найдите максимальный элемент
//        и выведите его индекс.