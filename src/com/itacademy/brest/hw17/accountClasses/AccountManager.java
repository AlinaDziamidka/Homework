package com.itacademy.brest.hw17.accountClasses;


import com.itacademy.brest.hw17.Bank;
import com.itacademy.brest.hw17.Client;
import com.itacademy.brest.hw17.accountClasses.Account;
import com.itacademy.brest.hw17.accountClasses.AccountType;
import com.itacademy.brest.hw17.exception.AccountNotFoundException;
import com.itacademy.brest.hw17.exception.BankException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class AccountManager {

    private Bank bank;
    private Path path;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    private void createPath(Client client) {
        path = Paths.get("src/com/itacademy/brest/hw17/accounts/savings_account_" + client.getId() + ".txt");
    }

    public void createAccount(Account account) {
        createPath(account.getClient());
        createAccountFileIFAbsent();

        try {
            if (!findAccount(account.getAccountType())) {
                addAccount(account);
            }
        } catch (BankException e) {
            throw new BankException(account.getAccountType() + " exist");
        }
    }

    private void createAccountFileIFAbsent() {

        InputStream account = null;

        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException("/incorrect path");
            }
        }
    }

    private boolean findAccount(AccountType accountType) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(accountType.toString())) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void addAccount(Account account) {
        try (FileWriter fw = new FileWriter(path.toFile(), true)) {

            String newAccount = account.getAccountType().toString() + " " + account.getAccountNumber() + "\n";

            fw.write(newAccount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(Client client, AccountType accountType) {
        createPath(client);
        Path tempFile = createTempFile();
        removeAccountFromFile(accountType, tempFile);
        renameAccountFile(tempFile);

        if (path.toFile().length() == 0) {
            path.toFile().delete();
        }
    }

    private void removeAccountFromFile(AccountType accountType, Path tempFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile.toFile()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.contains(accountType.toString())) {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException e) {
            throw new AccountNotFoundException(accountType + " not exist");
        }
    }

    private static Path createTempFile() {
        Path tempFile = null;
        try {
            tempFile = Files.createFile(Path.of("src/com/itacademy/brest/hw17/accounts/tempFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException("/incorect tempFile path ");
        }
        return tempFile;
    }

    private void renameAccountFile(Path tempFile) {
        try {
            Files.move(tempFile, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<String> getListOfAccounts(Client client) {
        createPath(client);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
