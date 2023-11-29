package com.itacademy.brest.hw17.exception;

public class AccountNotFoundException extends BankException{
    public AccountNotFoundException(String message) {
        super(message);
    }
}
