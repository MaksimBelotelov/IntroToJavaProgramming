package org.example.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
(New Account class) An Account class was specified in Programming Exercise 9.7.
Design a new Account class as follows:
■■ Add a new data field name of the String type to store the name of the
customer.
■■ Add a new constructor that constructs an account with the specified name, id,
and balance.
■■ Add a new data field named transactions whose type is ArrayList that
stores the transaction for the accounts. Each transaction is an instance of the
Transaction class, which is defined as shown in ­Figure 11.6.
■■ Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
■■ All other properties and methods are the same as in Programming Exercise 9.7.
Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122 , and name George . Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary
that shows the account holder name, interest rate, balance, and all transactions.
 */
public class Ex11_8 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);
    }
}

class NewAccount extends Account {
    private String name;
    private ArrayList<Transaction> transactions;

    public NewAccount(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            double remainder = getBalance() - amount;
            String description = String.format("Withdraw " + amount + "remainder: " + remainder);
            Transaction transaction =
                    new Transaction('W', amount, remainder, description);
            setBalance(remainder);
            transactions.add(transaction);
        }
        else
            System.out.println("Not enough money. Your balance: " + getBalance());
    }

    @Override
    public void deposit(double amount) {
        String description = String.format("Deposit " + amount);
        setBalance(getBalance() + amount);
        Transaction transaction =
                new Transaction('D', amount, getBalance(), description);
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "name='" + name + "\n" +
                "interest rate=" + getAnnualInterestRate() + "\n" +
                "balance=" + getBalance() + "\n" +
                transactions.toString();
    }
}

class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}' + "\n";
    }
}