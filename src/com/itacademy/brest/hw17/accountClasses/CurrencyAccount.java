package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;
import com.itacademy.brest.hw17.Transferable;
import com.itacademy.brest.hw17.accountClasses.Account;
import com.itacademy.brest.hw17.exception.AccountException;

public class CurrencyAccount extends Account implements Transferable {

    public static double currencyRate = 3;

    public CurrencyAccount(int accountNumber, Client client, AccountType accountType) {
        super(accountNumber, client, accountType);
    }

    public CurrencyAccount() {
    }

    public double getCurrencyRate() {
        return currencyRate;
    }

    @Override
    public void replenishBalance(double amount) {
        super.balance += amount / currencyRate;
    }

    @Override
    public void transferTo(double amount, AccountType fromAccountType) {
        replenishBalance(amount);
    }

    @Override
    public void transferFrom(double amount) {
        if (super.balance >= amount / currencyRate) {
            super.balance -= amount / currencyRate;
        } else {
            throw new AccountException(AccountType.CURRENCY_ACCOUNT + ": /not enough money");
        }
    }
}
