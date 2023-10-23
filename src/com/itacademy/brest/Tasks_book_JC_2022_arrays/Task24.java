package com.itacademy.brest.Tasks_book_JC_2022_arrays;

public class Task24 {
    public static void main(String[] args) {


        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j < n) {
                    arr[i][j] = 1;
                } else if (i >= j && i + j >= n - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//    Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть
//        таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1