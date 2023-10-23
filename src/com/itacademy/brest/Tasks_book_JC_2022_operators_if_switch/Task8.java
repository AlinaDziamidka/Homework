package com.itacademy.brest.Tasks_book_JC_2022_operators_if_switch;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину одной стороны прямоугольного отверстия (целое число): ");
        int a = scanner.nextInt();

        System.out.print("Введите длину второй смежной стороны прямоугольного отверстия (целое число): ");
        int b = scanner.nextInt();

        System.out.print("Введите радиус круглой картонки (целое число): ");
        int r = scanner.nextInt();

        int diagonal = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        int diameter = r * 2;
        boolean isClose = false;

        if (diameter >= diagonal) {
            isClose = true;
        }

        if (isClose) {
            System.out.println("Круглая картонка полностю перекрывает прямоугольное отверстие");
        } else {
            System.out.println("Круглая картонка не перекрывает полностю прямоугольное отверстие");
        }
    }
}
