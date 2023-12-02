package com.itacademy.brest.hw17;

import com.itacademy.brest.hw17.accountClasses.*;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank("A");

        Client client = new Client("A", "B");
        bank.addClient(client);

        bank.createAccount(12, client, AccountType.CREDIT_ACCOUNT);
        bank.createAccount(123, client, AccountType.CURRENCY_ACCOUNT);
        bank.createAccount(1234, client, AccountType.CURRENT_ACCOUNT);
        bank.createAccount(12345, client, AccountType.DEPOSIT_ACCOUNT);


        bank.takeCredit(client, 1100);

        bank.addMoneyToAccount(client, AccountType.CURRENT_ACCOUNT, 800);
        bank.addMoneyToAccount(client, AccountType.CURRENCY_ACCOUNT, 900);
//        bank.addMoneyToAccount(client, AccountType.CREDIT_ACCOUNT, 1000);
        bank.addMoneyToAccount(client, AccountType.DEPOSIT_ACCOUNT, 500);
//        bank.showBalance(client, AccountType.CURRENT_ACCOUNT);
//        bank.showBalance(client, AccountType.CURRENCY_ACCOUNT);
//        bank.showBalance(client, AccountType.DEPOSIT_ACCOUNT);
//        bank.showBalance(client, AccountType.CREDIT_ACCOUNT);
//        bank.getInformationAboutClientAccounts(client);
//        bank.getDetailsAllClientsAllAccounts();

//        bank.transferBetweenAccounts(client, client, AccountType.DEPOSIT_ACCOUNT, AccountType.CURRENT_ACCOUNT, 400);
//        bank.transferBetweenAccounts(client, client, AccountType.CURRENCY_ACCOUNT, AccountType.CURRENT_ACCOUNT, 800);
//        bank.transferBetweenAccounts(client, client, AccountType.CREDIT_ACCOUNT, AccountType.CURRENT_ACCOUNT, 800);
//        bank.transferBetweenAccounts(client, client, AccountType.CURRENT_ACCOUNT, AccountType.DEPOSIT_ACCOUNT, 600);
//        bank.transferBetweenAccounts(client, client, AccountType.CURRENCY_ACCOUNT, AccountType.CREDIT_ACCOUNT, 600);


//        bank.showBalance(client, AccountType.DEPOSIT_ACCOUNT);
//        bank.showBalance(client, AccountType.CURRENT_ACCOUNT);
//        bank.showBalance(client, AccountType.CREDIT_ACCOUNT);
//        bank.showBalance(client, AccountType.CURRENCY_ACCOUNT);

//        bank.getBankBalance();

        bank.deleteAccount(client, AccountType.CURRENT_ACCOUNT);
        bank.deleteAccount(client, AccountType.CREDIT_ACCOUNT);
        bank.deleteAccount(client, AccountType.CURRENCY_ACCOUNT);
//        bank.deleteAccount(client, AccountType.DEPOSIT_ACCOUNT);

    }


}
