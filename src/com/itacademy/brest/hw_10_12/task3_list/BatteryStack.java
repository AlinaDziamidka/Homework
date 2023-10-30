package com.itacademy.brest.hw_10_12.task3_list;

import java.util.Stack;

public class BatteryStack {

    static class Battery {

        private Stack<String> batteries;
        private String name;

        public void addBattery(String name) {
            batteries.push(name);
        }

        public void removeBattery() {
            batteries.pop();
        }

        public void checkLastBattery() {
            batteries.peek();
        }

        public Stack<String> getBatteries() {
            return batteries;
        }

        public void setBatteries(Stack<String> batteries) {
            this.batteries = batteries;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Battery batteries = new Battery();
        batteries.setBatteries(new Stack<String>());

        batteries.addBattery("battery1");
        batteries.addBattery("battery2");
        batteries.addBattery("battery3");
        batteries.addBattery("battery4");

        batteries.removeBattery();

        batteries.checkLastBattery();

        System.out.println(batteries.getBatteries());
    }
}
