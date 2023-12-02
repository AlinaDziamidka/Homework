package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;

public class AccountFactory {

    public static Account createAccount(int accountNumber, Client client, AccountType accountType) {
      return switch (accountType) {
            case CURRENT_ACCOUNT -> new CurrentAccount(accountNumber, client, accountType);
            case CREDIT_ACCOUNT -> new CreditAccount(accountNumber, client, accountType);
            case DEPOSIT_ACCOUNT -> new DepositAccount(accountNumber, client, accountType);
            case CURRENCY_ACCOUNT -> new CurrencyAccount(accountNumber, client, accountType);
        };
    }
}
