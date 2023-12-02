package com.itacademy.brest.hw17.trasferOperations;

import com.itacademy.brest.hw17.accountClasses.AccountType;
import com.itacademy.brest.hw17.accountClasses.CurrencyAccount;

public interface Transferable {
    void transferTo(double amount, AccountType fromAccountType);

    void transferFrom(double amount);

}
