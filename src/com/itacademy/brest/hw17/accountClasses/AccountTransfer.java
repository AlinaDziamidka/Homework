package com.itacademy.brest.hw17.accountClasses;

import com.itacademy.brest.hw17.Bank;

public class AccountTransfer {

    public void doTransferFromAccount(Account account, double amount) {
        switch (account.getAccountType()) {
            case DEPOSIT_ACCOUNT -> ((DepositAccount) account).transferFrom(amount);
            case CURRENT_ACCOUNT -> ((CurrentAccount) account).transferFrom(amount);
            case CURRENCY_ACCOUNT -> ((CurrencyAccount) account).transferFrom(amount);
            case CREDIT_ACCOUNT -> ((CreditAccount) account).transferFrom(amount);
        }
    }

    public void doTransferToAccount(Account account, double amount, AccountType fromaccountType) {
        switch (account.getAccountType()) {
            case DEPOSIT_ACCOUNT -> ((DepositAccount) account).transferTo(amount, fromaccountType);
            case CURRENT_ACCOUNT -> ((CurrentAccount) account).transferTo(amount, fromaccountType);
            case CURRENCY_ACCOUNT -> ((CurrencyAccount) account).transferTo(amount, fromaccountType);
            case CREDIT_ACCOUNT -> ((CreditAccount) account).transferTo(amount, fromaccountType);
        }
    }

}
