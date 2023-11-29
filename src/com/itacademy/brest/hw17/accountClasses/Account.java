package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Client;

public abstract class Account {

    private int accountNumber;
    private Client client;
    public double balance;
    private AccountType accountType;

    public Account(int accountNumber, Client client, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.accountType = accountType;
    }

    protected Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void replenishBalance(double amount);

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

}
