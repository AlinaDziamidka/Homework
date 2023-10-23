package com.itacademy.brest.Tasks_book_JC_2022_classes.ATM;

public class ATM {

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

    public boolean isValid(int amount) {
        int n20Count = 1;
        int newAmount = amount - 20;
        boolean isValid = false;

        if (amount % 20 == 0) {
            return true;
        } else if (amount % 50 == 0) {
            return true;
        }

        while (n20Count <= n20) {
            if (isValid) {
                return true;
            }
            while (!isValid) {
                isValid = true;
                if ((newAmount) % 50 != 0) {
                    isValid = false;
                }
                newAmount -= 20;
                n20Count += 1;
                if (newAmount < 0) {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean validBanknote(int amount) {
        int count = 0;
        int minN100 = Math.min(amount / 100, n100);
        int minN50 = Math.min((amount - (minN100 * 100)) / 50, n50);
        int newN20 = (amount - (minN100 * 100 + minN50 * 50)) / 20;

        if ((amount - (minN100 * 100 + minN50 * 50 + newN20 * 20)) % 20 == 0) {
            count = 1;

        } else if (amount < 100 && amount % 50 != 0 || amount % (minN100 * 100) != 50) {
            if (amount < 100 || amount % (minN100 * 100) <= n20 * 20 && amount % (minN100 * 100) > 40) {
                count = 2;

            } else {
                if ((amount - 60) / 50 <= 1) {
                    minN100 = 0;
                } else if ((amount - 60 - minN100 * 100) / 50 <= 1) {
                    minN100 -= 1;
                }
                minN50 = (amount - minN100 * 100 - 60) / 50;
                count = 3;
            }
        }

        switch (count) {
            case 1 -> {
                if (isEnoughCash(newN20, minN50, minN100)) {
                    System.out.println(minN100 + "*100, " + minN50 + "*50, " + newN20 + "*20");
                    issueBanknotes(newN20, minN50, minN100);
                    return true;
                }
                System.out.println("Not enough banknote");
            }
            case 2 -> {
                if (isEnoughCash((amount - (minN100 * 100)) / 20, 0, minN100)) {
                    System.out.println(minN100 + "*100, " + (amount - (minN100 * 100)) / 20 + "*20");
                    issueBanknotes((amount - (minN100 * 100)) / 20, 0, minN100);
                    return true;
                }
                System.out.println("Not enough banknote");
            }
            case 3 -> {
                if ((amount - minN100 * 100 - minN50 * 50) % 20 != 0) {
                    System.out.println("Not enough banknote");
                    return false;
                } else if (isEnoughCash((amount - minN100 * 100 - minN50 * 50) / 20, minN50, minN100)) {
                    System.out.println(minN100 + "*100, " + minN50 + "*50, " +
                            (amount - minN100 * 100 - minN50 * 50) / 20 + "*20");
                    issueBanknotes((amount - minN100 * 100 - minN50 * 50) / 20, minN50, minN100);
                    return true;
                }
                System.out.println("Not enough banknote");
            }
        }
        return false;
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

    public int getATMbalance() {
        return n20 * 20 + n50 * 50 + n100 * 100;
    }

    public boolean isEnoughCash(int n20, int n50, int n100) {
        if (n20 <= this.n20 && n50 <= this.n50 && n100 <= this.n100) {
            return true;
        }
        return false;
    }
}
