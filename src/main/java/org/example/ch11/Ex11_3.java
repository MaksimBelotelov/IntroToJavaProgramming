package org.example.ch11;

import java.util.Date;

/*
(Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and with-
draw funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program
that creates objects of Account, SavingsAccount, and CheckingAccount and
invokes their toString() methods.
 */

public class Ex11_3 {
    public static void main(String[] args) {
        Account account = new Account();
        SavingsAccount savingsAccount = new SavingsAccount(123, 100.0, 2);
        CheckingAccount checkingAccount = new CheckingAccount(234, 1000.0);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Not enough money. Your balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance);
        this.setAnnualInterestRate(annualInterestRate);
    }

    @Override
    public String toString() {
        return super.toString() + " type = Savings account";
    }

}

class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount(int id, double overdraft) {
        super(id, 0.0);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() + overdraft >= amount)
            setBalance(this.getBalance() - amount);
        else
            System.out.println("Not enough money. Balance: " + getBalance() + "\nOverdraft: " + overdraft);
    }

    @Override
    public String toString() {
        return super.toString() +
                " overdraft = " + overdraft +
                " type = Checking account";
    }
}
