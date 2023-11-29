package com.itacademy.brest.tasksCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<>();
        String[] starr = str.split(" ");
        int index = 0;
        for (String element : starr) {
            bigList.add(Integer.parseInt(starr[index]));
            index++;
        }
        bigList.forEach(element -> System.out.print(element + " "));
        System.out.println();
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList = Arrays.asList(div2list, div3list, otherList);
        return resultList;
    }

    public static void main(String[] args) {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the line:");
            str = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        List<Integer> bigList = createBigList(str);

        ArrayList<Integer> div2list = new ArrayList<>();
        ArrayList<Integer> div3list = new ArrayList<>();
        ArrayList<Integer> otherlist = new ArrayList<>();

        for (int i : bigList) {
            if (i % 2 == 0) {
                div2list.add(i);
            } else if (i % 3 == 0) {
                div3list.add(i);
            } else {
                otherlist.add(i);
            }
        }

        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        for (List<Integer> i : resultList) {
            Collections.sort(i);
            i.forEach(integer -> System.out.print(integer + " "));
        }
    }
}


