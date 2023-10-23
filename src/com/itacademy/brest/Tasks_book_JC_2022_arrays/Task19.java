package com.itacademy.brest.Tasks_book_JC_2022_arrays;

import java.util.Random;

public class Task19 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
            System.out.println(arr[arr.length-1]);
        }
    }

