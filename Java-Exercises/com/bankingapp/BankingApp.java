package com.bankingapp;

import java.util.Optional;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Adding some initial accounts
        bank.addAccount(new BankAccount("12345", "John Doe", 1000.0));
        bank.addAccount(new BankAccount("67890", "Jane Smith", 2000.0));

        while (true) {
            System.out.println("Welcome to the Banking App");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewBalance(bank, scanner);
                    break;
                case 2:
                    depositMoney(bank, scanner);
                    break;
                case 3:
                    withdrawMoney(bank, scanner);
                    break;
                case 4:
                    bank.displayAllAccounts();
                    break;
                case 5:
                    System.out.println("Thank you for using the Banking App!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewBalance(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        Optional<BankAccount> accountOpt = bank.findAccountByNumber(accountNumber);
        if (accountOpt.isPresent()) {
            BankAccount account = accountOpt.get();
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    private static void depositMoney(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        Optional<BankAccount> accountOpt = bank.findAccountByNumber(accountNumber);
        if (accountOpt.isPresent()) {
            BankAccount account = accountOpt.get();
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    private static void withdrawMoney(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        Optional<BankAccount> accountOpt = bank.findAccountByNumber(accountNumber);
        if (accountOpt.isPresent()) {
            BankAccount account = accountOpt.get();
            try {
                account.withdraw(amount);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Account not found");
        }
    }
}