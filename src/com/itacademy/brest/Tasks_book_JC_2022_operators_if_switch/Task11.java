package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину первого дома (целое число): ");
        int a = scanner.nextInt();

        System.out.print("Введите длину первого дома (целое число): ");
        int b = scanner.nextInt();

        System.out.print("Введите ширину второго дома (целое число): ");
        int c = scanner.nextInt();

        System.out.print("Введите длину второго дома (целое число): ");
        int d = scanner.nextInt();

        System.out.print("Введите ширину участка (целое число): ");
        int e = scanner.nextInt();

        System.out.print("Введите длину участка (целое число): ");
        int f = scanner.nextInt();

        if (isHouseFit(a, b, c, d, e, f)) {
            System.out.println("Дома можно разместить на одном участке");
        } else {
            System.out.println("Дома невозможно разместить на одном участке");
        }
    }

    public static boolean isHouseFit(int widthH1, int lengthH1, int widthH2, int lengthH2, int widthArea, int lengthArea) {
        if (widthH1 + widthH2 <= widthArea && Math.max(lengthH2, lengthH1) <= lengthArea) {
            return true;
        } else if (lengthH1 + lengthH2 <= lengthArea && Math.max(widthH1, widthH2) <= widthArea) {
            return true;
        }

        if (widthH1 + widthH2 <= lengthArea && Math.max(lengthH1, lengthH2) <= widthArea) {
            return true;
        } else if (lengthH1 + lengthH2 <= widthArea && Math.max(widthH1, widthH2) <= lengthArea) {
            return true;
        }

        if (lengthH1 + widthH2 <= lengthArea && Math.max(widthH1, lengthH2) <= widthArea) {
            return true;
        } else if (widthH1 + lengthH2 <= lengthArea && Math.max(lengthH1, widthH2) <= widthArea) {
            return true;
        }
        return false;
    }
}
