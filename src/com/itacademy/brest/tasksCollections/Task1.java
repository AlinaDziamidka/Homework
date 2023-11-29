package com.itacademy.brest.tasksCollections;

import java.lang.reflect.Array;
import java.util.*;

public class Task1 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        if (o1.length() > o2.length()) {
            return -1;
        } else if (o1.length() < o2.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static List<String> changeList(List<String> list) {
        list.sort(new Task1());
        for (int i = 1; i < list.size(); i++) {
            list.set(i, list.get(0));
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "hello", "goodmorning", "ass");
        System.out.println(changeList(list));
    }
}
