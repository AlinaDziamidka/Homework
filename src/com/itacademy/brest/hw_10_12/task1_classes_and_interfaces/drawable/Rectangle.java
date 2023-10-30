package com.itacademy.brest.hw_10_12.task1_classes_and_interfaces.drawable;

import java.util.Scanner;

public class Rectangle extends Shape implements Drawable {

    Scanner scanner = new Scanner(System.in);

    float a = 0;
    float b = 0;

    @Override
    public float draw() {
        if (a == 0) {
            System.out.println("Enter rectangle length: ");
            a = scanner.nextFloat();
            return a;
        }
        if (b == 0) {
            System.out.println("Enter rectangle width: ");
            b = scanner.nextFloat();
            return b;
        }
        return 0;
    }

    @Override
    double area() {
        while (a == 0 | b == 0) {
            draw();
        }
        return a * b;
    }
}