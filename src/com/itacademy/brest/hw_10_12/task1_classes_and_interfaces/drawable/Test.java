package com.itacademy.brest.hw_10_12.task1_classes_and_interfaces.drawable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        System.out.println(circle.area());

        rectangle.draw();
        System.out.println(rectangle.area());
    }
}
