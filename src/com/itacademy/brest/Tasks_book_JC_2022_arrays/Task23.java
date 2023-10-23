package com.itacademy.brest.Tasks_book_JC_2022_arrays;

import java.util.Random;

public class Task23 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        int temp = 0;
        int lastNum = arr.length - 1;

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[lastNum];
            arr[lastNum] = arr[i];
            arr[i] = temp;
            lastNum--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
