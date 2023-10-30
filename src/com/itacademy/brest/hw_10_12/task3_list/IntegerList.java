package com.itacademy.brest.hw_10_12.task3_list;

import java.util.*;

public class IntegerList {

    public static void deleteDuplicateElements(List<Integer> list) {
        if (list.isEmpty() || list == null) {
            System.out.println("List is empty or containers null values");
        }
        Set<Integer> nonDuplicate = new HashSet<Integer>(list);
        List<Integer> deleteDuplicate = new ArrayList<>(nonDuplicate);
        System.out.println(deleteDuplicate);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 7, 1, 5, 5, 8, 3, 7, 2, 1, 7, 9, 8);
        deleteDuplicateElements(integerList);
    }
}
