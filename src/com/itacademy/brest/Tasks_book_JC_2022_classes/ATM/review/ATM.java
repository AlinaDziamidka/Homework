package com.itacademy.brest.Tasks_book_JC_2022_classes.ATM.review;

public class ATM {

    public static final int DENOMINATION_20 = 20;
    public static final int DENOMINATION_50 = 50;
    public static final int DENOMINATION_100 = 100;
    private int n20;
    private int n50;
    private int n100;

    public ATM(int n20, int n50, int n100) {
        this.n20 = n20;
        this.n50 = n50;
        this.n100 = n100;
    }

    public void addBanknote20(int amount) {
        n20 += amount;
    }

    public void addBanknote50(int amount) {
        n50 += amount;
    }

    public void addBanknote100(int amount) {
        n100 += amount;
    }

    public void issueBanknote20(int amount) {
        n20 -= amount;
    }

    public void issueBanknote50(int amount) {
        n50 -= amount;
    }

    public void issueBanknote100(int amount) {
        n100 -= amount;
    }

    public void issueBanknotes(int n20, int n50, int n100) {
        this.n20 -= n20;
        this.n50 -= n50;
        this.n100 -= n100;
    }

    public void getBanknotes(int amount) {
        if (amount < DENOMINATION_20) {
            System.out.println("Invalid amount. Amount should be more than 20. Please, enter another amount: ");
            return;
        }
        int countN20 = 0;
        int countN50 = 0;
        int countN100 = 0;

        if (amount / DENOMINATION_100 >= 1) {
            countN100 = amount / DENOMINATION_100;
            int expense = countN100 * DENOMINATION_100;
            n100 -= expense;
            amount -= expense;
        }
        if (amount / DENOMINATION_50 >= 1) {
            countN50 = amount / DENOMINATION_50;
            int expense = countN50 * DENOMINATION_50;
            n50 -= expense;
            amount -= expense;
        }
        if (amount / DENOMINATION_20 >= 1) {
            countN20 = amount / DENOMINATION_20;
            int expense = countN20 * DENOMINATION_20;
            n20 -= expense;
            amount -= expense;
        }
        if (amount == 0) {
            printBanknotesCount(DENOMINATION_20, countN20);
            printBanknotesCount(DENOMINATION_50, countN50);
            printBanknotesCount(DENOMINATION_100, countN100);
        } else if (amount < DENOMINATION_20) {
            System.out.println("Invalid amount. Amount should be multiples of 20. 50, 100. Please, enter another amount: ");
        }
    }

    private static void printBanknotesCount(int denomination, int count) {
        if (count > 0) {
            System.out.println("You have gotten the next banknotes " + denomination + " = " + count);
        }
    }

    public int getN20() {
        return n20;
    }

    public int getN50() {
        return n50;
    }

    public int getN100() {
        return n100;
    }

    public int getATMBalance() {
        return n20 * DENOMINATION_20 + n50 * DENOMINATION_50 + n100 * DENOMINATION_100;
    }
}
