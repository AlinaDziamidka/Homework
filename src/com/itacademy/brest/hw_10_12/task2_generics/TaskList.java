package com.itacademy.brest.hw_10_12.task2_generics;

import java.util.Arrays;
import java.util.List;

public class TaskList {

    public static <T extends Comparable<T>> void findMinMax(List<T> list) {
        T min = list.get(0);
        T max = list.get(0);

        if (list.isEmpty() || list == null) {
            System.out.println("List is empty or containers null values");
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(1);
            } else if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 9, 5, 7, 3);
        findMinMax(list);
    }
}