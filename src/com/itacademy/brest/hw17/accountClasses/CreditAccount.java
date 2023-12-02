package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;
import com.itacademy.brest.hw17.trasferOperations.Transferable;
import com.itacademy.brest.hw17.exception.AccountException;
import com.itacademy.brest.hw17.exception.TransferException;


public class CreditAccount extends Account implements Transferable {

    public CreditAccount(int accountNumber, Client client, AccountType accountType) {
        super(accountNumber, client, accountType);
    }

    @Override
    public void replenishBalance(double amount) {
        if (super.balance + amount <= 0) {
            super.balance += amount;
        } else {
            throw new AccountException(AccountType.CREDIT_ACCOUNT + ": /amount exceeded credit payments");
        }
    }

    public void takeCredit(double amount) {
        if (super.balance == 0) {
            super.balance -= amount;
        } else {
            throw new AccountException(AccountType.CREDIT_ACCOUNT + ": /last credit not repaid");
        }
    }

    @Override
    public void transferTo(double amount, AccountType fromaccountType) {
        replenishBalance(amount);
    }

    @Override
    public void transferFrom(double amount) {
        throw new TransferException("/transfer from" + AccountType.CREDIT_ACCOUNT + " is prohibited");
    }
}
