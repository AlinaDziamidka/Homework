package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;
import com.itacademy.brest.hw17.Transferable;
import com.itacademy.brest.hw17.accountClasses.Account;
import com.itacademy.brest.hw17.exception.BankException;
import com.itacademy.brest.hw17.exception.TransferException;

public class DepositAccount extends Account implements Transferable {
    private double maxDeposit;

    public DepositAccount(int accountNumber, Client client, AccountType accountType, double maxDeposit) {
        super(accountNumber, client, accountType);
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void replenishBalance(double amount) {
        if (super.balance + amount <= maxDeposit) {
            super.balance += amount;
        } else {
            throw new BankException(AccountType.DEPOSIT_ACCOUNT + ": /limit is exceeded");
        }
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
            throw new TransferException(AccountType.DEPOSIT_ACCOUNT + ": /not enough money");
        }
    }
}
