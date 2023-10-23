package com.itacademy.brest.Tasks_book_JC_2022_classes.ATM.review;


import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean operation = true;
        ATM atm = new ATM(5, 3, 2);

        while (operation) {
            System.out.println("Choose the banking operation. If you want to take cash, press 1. If you want deposit cash, press 2");
            int chose = scanner.nextInt();

            if (chose == 1) {
                System.out.println("ATM issues banknotes of 20, 50, 100. Enter the amount: ");
                int amount = scanner.nextInt();

                while (amount > atm.getATMBalance()) {
                    System.out.println("Not enough cash at ATM. Please, enter another amount or -1 to exit: ");
                    amount = scanner.nextInt();
                    if (amount < 0) {
                        break;
                    }
                }
                atm.getBanknotes(amount);

                operation = isOperation(atm, scanner);
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

                operation = isOperation(atm, scanner);
            } else {
                System.out.println("Error!!!");
                operation = isOperation(atm, scanner);
            }
        }
    }

    private static boolean isOperation(ATM atm, Scanner scanner) {
        boolean operation;
        System.out.println();
        System.out.println("Current ATM balance: " + atm.getATMBalance());
        System.out.println();

        System.out.println("Do you want to make one more operation? Press 1 - yes, press 2 - no");
        int answer = scanner.nextInt();

        if (answer == 1) {
            operation = true;
        } else {
            System.out.println("Good day");
            operation = false;
        }
        return operation;
    }
}




