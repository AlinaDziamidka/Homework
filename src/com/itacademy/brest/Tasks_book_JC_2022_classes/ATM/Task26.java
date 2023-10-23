package com.itacademy.brest.Tasks_book_JC_2022_classes.ATM;

import com.itacademy.brest.Tasks_book_JC_2022_classes.ATM.ATM;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean operation = true;
        ATM atm = new ATM(5, 3, 2);

        while (operation) {
            System.out.println("Choose the banking operation. If you want to take cash, press 1. If you want deposit cash, press 2");
            int chose = scanner.nextInt();

            boolean valid = false;

            if (chose == 1) {
                System.out.println("ATM issues banknotes of 20, 50, 100. Enter the amount: ");
                int amount = scanner.nextInt();
                while (amount > atm.getATMbalance()) {
                    System.out.println("Not enough cash at ATM. Please, enter another amount: ");
                    amount = scanner.nextInt();
                }
                while (!atm.isValid(amount)) {
                    System.out.println("Invalid amount. Please, enter another amount: ");
                    amount = scanner.nextInt();
                    while (amount > atm.getATMbalance()) {
                        System.out.println("Not enough cash at ATM. Please, enter another amount: ");
                        amount = scanner.nextInt();
                    }
                }
                if (atm.validBanknote(amount)) {
                    System.out.println("Operation was successful");
                } else {
                    System.out.println("Operation was denied");
                }
                System.out.println();
                System.out.println("Current ATM balance: " + atm.getATMbalance());
                System.out.println();

                System.out.println("Do you want to make one more operation? Press 1 - yes, press 2 - no");

                int answer = scanner.nextInt();
                if (answer == 1) {
                    operation = true;
                } else {
                    System.out.println("Good day");
                    break;
                }

            } else if (chose == 2) {
                System.out.println("ATM takes banknotes of 20, 50, 100");

                System.out.println("Enter the amount banknotes of 20: ");
                int banknote20 = scanner.nextInt();

                atm.addBanknote20(banknote20);

                System.out.println("Enter the amount banknotes of 50: ");
                int banknote50 = scanner.nextInt();

                atm.addBanknote50(banknote50);

                System.out.println("Enter the amount banknotes of 100: ");
                int banknote100 = scanner.nextInt();

                atm.addBanknote100(banknote100);

                System.out.println("Current ATM balance: " + atm.getATMbalance());

                System.out.println();
                System.out.println("Do you want to make one more operation? Press 1 - yes, press 2 - no");

                int answer = scanner.nextInt();
                if (answer == 1) {
                    operation = true;
                } else {
                    System.out.println("Good day");
                    break;
                }
            } else {
                System.out.println("Error. Choose the banking operation. If you want to take cash, press 1. If you want deposit cash, press 2");
                chose = scanner.nextInt();
            }
        }
    }
}




