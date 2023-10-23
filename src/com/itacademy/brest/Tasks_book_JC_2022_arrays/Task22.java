package com.itacademy.brest.Tasks_book_JC_2022_arrays;

public class Task22 {

    public static int findStartIndex(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max | array[i] == min) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 1, 3, 3, 4, 3, 1, 3};
        int max = arr[0];
        int min = arr[0];
        int endIndexMin = 0;
        int endIndexMax = 0;
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                endIndexMax = i;
            } else if (arr[i] <= min) {
                min = arr[i];
                endIndexMin = i;
            }
        }

        int endIndex = Math.max(endIndexMin, endIndexMax);


     for (int i = findStartIndex(arr, max, min)+1; i<= endIndex-1; i++){
         sum += arr[i];
     }

        System.out.println(sum);


    }
}


//    Создайте переменную для массива з 10 элементов. Заполните его
//        произвольными значениями целочисленного типа. Определите сумму элементов
//        массива, расположенных между минимальным и максимальным значениями. Если
//        значений максимальных и минимальных несколько, то необходимо взять
//        максимальное значение разницы индексов между максимальным и минимальным
//        значениями.