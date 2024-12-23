package com.bankingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public Optional<BankAccount> findAccountByNumber(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst();
    }

    public void displayAllAccounts() {
        accounts.forEach(account -> System.out.println(account.getAccountHolderName() + " - " + account.getAccountNumber() + " - Balance: " + account.getBalance()));
    }
}
