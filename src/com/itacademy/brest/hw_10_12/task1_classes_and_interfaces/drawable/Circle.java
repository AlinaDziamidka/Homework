package com.itacademy.brest.hw_10_12.task1_classes_and_interfaces.drawable;

import java.util.Scanner;

public class Circle extends Shape implements Drawable {
    Scanner scanner = new Scanner(System.in);

    float r = 0;

    @Override
    public float draw() {
        System.out.println("Enter circle radius: ");
        r = scanner.nextFloat();
        return r;
    }

    @Override
    double area() {
        return 3.14 * r * r;
    }
}
