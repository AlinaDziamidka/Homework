package com.itacademy.brest.tasksCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] s = scanner.nextLine().split(" ");
        LinkedList<Integer> ll = new LinkedList<>();

        for (String s1 : s) {
            ll.add(Integer.parseInt(s1));
        }

        for (int i = 0; i < 3; i++) {
            ll.remove(0);
        }

        Collections.sort(ll);
        System.out.println(ll);
    }
}
