package org.example.ch9;

import java.util.Date;

/*
(The Account class) Design a class named Account that contains:
■■ A private int data field named id for the account (default 0).
■■ A private double data field named balance for the account (default 0).
■■ A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume that all accounts have the same interest rate.
■■ A private Date data field named dateCreated that stores the date when the
account was created.
■■ A no-arg constructor that creates a default account.
■■ A constructor that creates an account with the specified id and initial balance.
■■ The accessor and mutator methods for id, balance , and annualInterestRate.
■■ The accessor method for dateCreated.
■■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■■ A method named getMonthlyInterest() that returns the monthly interest.
■■ A method named withdraw that withdraws a specified amount from the
account.
■■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyIntere-
stRate is annualInterestRate / 12. Note annualInterestRate is a per-
centage, for example 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
 */
public class Ex9_7 {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000);
        testAccount.setAnnualInterestRate(4.5);
        testAccount.withdraw(2500);
        testAccount.deposit(3000);
        System.out.println("Balance: " + testAccount.getBalance());
        System.out.println("Monthly interest: " + testAccount.getMonthlyInterest());
        System.out.println("Date created: " + testAccount.getDateCreated());
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
        this.dateCreated = new Date();
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
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}