package com.itacademy.brest.hw17;

import com.itacademy.brest.hw17.accountClasses.*;
import com.itacademy.brest.hw17.exception.AccountNotFoundException;
import com.itacademy.brest.hw17.exception.BankException;
import com.itacademy.brest.hw17.exception.ClientNotFoundException;
import com.itacademy.brest.hw17.exception.TransferException;


import java.util.*;
import java.util.stream.Collectors;

import static com.itacademy.brest.hw17.accountClasses.AccountType.CREDIT_ACCOUNT;

public class Bank {

    private String name;
    private List<Client> clients;
    private Map<Client, List<Account>> accountsDataBase = new HashMap<>();

    private AccountManager accountManager;

    public Bank(String name, List<Client> clients, AccountManager accountManager) {
        this.name = name;
        this.clients = clients;
        this.accountManager = accountManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Map<Client, List<Account>> getAccountsDataBase() {
        return accountsDataBase;
    }

    public void setAccountsDataBase(Map<Client, List<Account>> accountsDataBase) {
        this.accountsDataBase = accountsDataBase;
    }

    public void addClient(Client client) {
        if (Objects.nonNull(client)) {
            clients.add(client);
            accountsDataBase.put(client, new ArrayList<>());
        } else {
            throw new NullPointerException("/client data is null");
        }
    }

    private void isClientExist(Client client) {
        if (!accountsDataBase.containsKey(client)){
            ClientNotFoundException e = new ClientNotFoundException ("/client not added to bank");
            e.printStackTrace();
        }
    }

    private Account findAccountByAccountType(Client client, AccountType accountType) {
        return accountsDataBase.get(client).
                stream().filter(account -> account.getAccountType().equals(accountType)).
                findFirst().orElseThrow(() -> new AccountNotFoundException(accountType + " not exist"));
    }

    public void createAccount(Account account){
        isClientExist(account.getClient());

        boolean isAccountExist = accountsDataBase.get(account.getClient()).
                stream().
                anyMatch(account1 -> account1.getAccountType().equals(account.getAccountType()));

        if (isAccountExist){
            BankException e = new BankException(account.getAccountType() + " exist");
            e.printStackTrace();
        }

        accountManager.createAccount(account);
        accountsDataBase.get(account.getClient()).add(account);
    }

    public void deleteAccount(Client client, AccountType accountType) {
       isClientExist(client);
       Account removeAccount = findAccountByAccountType(client, accountType);

        accountManager.deleteAccount(client, accountType);
        accountsDataBase.get(client).remove(removeAccount);
    }

    public void addMoneyToAccount(Client client, AccountType accountType, double amount) {
        Account currentAccount = findAccountByAccountType(client, accountType);
        currentAccount.replenishBalance(amount);
    }

    public void showBalance(Client client, AccountType accountType) {
        System.out.println(findAccountByAccountType(client, accountType).getBalance());
    }

    public void transferBetweenAccounts(Client fromClient, Client toClient,
                                        AccountType fromAccountType, AccountType toAccountType, double amount) {

        isClientExist(fromClient);
        isClientExist(toClient);

        Account fromAccount = findAccountByAccountType(fromClient, fromAccountType);
        Account toAccount = findAccountByAccountType(toClient, toAccountType);
        AccountTransfer accountTransfer = new AccountTransfer();

        try {
            accountTransfer.doTransferFromAccount(fromAccount, amount);
            accountTransfer.doTransferToAccount(toAccount, amount, fromAccountType);
        } catch (TransferException e1) {
            throw new TransferException("/transfer not successfull");
        }
    }

    public void getInformationAboutClientAccounts(Client client) {
        isClientExist(client);
        accountManager.getListOfAccounts(client)
                .stream()
                .forEach(System.out::println);
    }

    public void getDetailsAllClientsAllAccounts() {
        Map<String, List<String>> map = clients.stream()
                .collect(Collectors.toMap(Client::getClientInformation, accountManager::getListOfAccounts));
        System.out.println(map.toString());
    }

    public void takeCredit(Client client, double amount) {
        isClientExist(client);
        findAccountByAccountType(client, CREDIT_ACCOUNT);

            CreditAccount creditAccount = (CreditAccount) findAccountByAccountType(client, CREDIT_ACCOUNT);
            creditAccount.takeCredit(amount);
    }

    public void getBankBalance() {
        double notCurrencyBankBalance = accountsDataBase.values().stream()
                .flatMap(List::stream)
                .filter(account -> !account.getAccountType().equals(AccountType.CURRENCY_ACCOUNT))
                .mapToDouble(Account::getBalance)
                .sum();

        double currencyBankBalance = accountsDataBase.values().stream()
                .flatMap(List::stream)
                .filter(account ->
                        account.getAccountType().equals(AccountType.CURRENCY_ACCOUNT))
                .mapToDouble(account ->
                        account.getBalance() * ((CurrencyAccount) account).getCurrencyRate())
                .sum();

        System.out.println(notCurrencyBankBalance + currencyBankBalance);
    }
}
