package com.itacademy.brest.hw_10_12.task4_map.count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterInString {

    public static Map<Character, Integer> countFrequency(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String line = scanner.nextLine();

        System.out.println("Symbols in line: ");

        for (Map.Entry<Character, Integer> entry : countFrequency(line).entrySet())
            System.out.print(entry.getKey() + " - " + entry.getValue() + "; ");
    }
}
