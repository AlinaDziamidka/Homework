package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;
import com.itacademy.brest.hw17.Transferable;
import com.itacademy.brest.hw17.accountClasses.Account;
import com.itacademy.brest.hw17.exception.AccountException;

public class CurrentAccount extends Account implements Transferable {
    public CurrentAccount(int accountNumber, Client client, AccountType accountType) {
        super(accountNumber, client, accountType);
    }

    @Override
    public void replenishBalance(double amount) {
        super.balance += amount;
    }

    @Override
    public void transferTo(double amount, AccountType fromAccountType) {
        replenishBalance(amount);
    }

    @Override
    public void transferFrom(double amount) {
        if (super.balance >= amount) {
            super.balance -= amount;
        } else {
            throw new AccountException(AccountType.CURRENT_ACCOUNT + ": /not enough money");
        }
    }
}
