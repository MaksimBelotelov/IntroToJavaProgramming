package org.example.ch10;

import java.util.Date;
import java.util.Scanner;

/*
(Game: ATM machine) Use the Account class created in Programming Exer-
cise 9.7 to simulate an ATM machine. Create 10 accounts in an array with id
0, 1, . . . , 9, and an initial balance of $100. The system prompts the user to
enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
Once an id is accepted, the main menu is displayed as shown in the sample
run. You can enter choice 1 for viewing the current balance, 2 for withdraw-
ing money, 3 for depositing money, and 4 for exiting the main menu. Once
you exit, the system will prompt for an id again. Thus, once the system starts,
it will not stop.
 */
public class Ex10_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        int currentId = -1;
        while (true) {
            if (currentId == -1) {
                System.out.print("Enter an id:");
                currentId = scanner.nextInt();
                if (currentId >= atm.getAccounts().length || currentId < 0) {
                    System.out.println("Incorrect id");
                    currentId = -1;
                }
            }
            else {
                while (currentId != -1) {
                    atm.showMainMenu();
                    int choice = scanner.nextInt();
                    double amount = 0;
                    switch (choice) {
                        case 1:
                            atm.checkBalance(currentId);
                            break;
                        case 2:
                            System.out.print("Enter an amount to withdraw: ");
                            amount = scanner.nextDouble();
                            atm.withdraw(currentId, amount);
                            break;
                        case 3:
                            System.out.println("Enter an amount to deposit: ");
                            amount = scanner.nextDouble();
                            atm.deposit(currentId, amount);
                            break;
                        case 4:
                            System.out.println("Good bye!");
                            currentId = -1;
                            break;
                        default:
                            System.out.println("Incorrect input");
                            break;
                    }
                }
            }
        }
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

class ATM {
    private Account[] accounts;

    public ATM() {
        accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void checkBalance(int id) {
        System.out.println(accounts[id].getBalance());
    }

    public void withdraw(int id, double amount) {
        if (amount <= accounts[id].getBalance() && amount > 0) {
            accounts[id].withdraw(amount);
            System.out.println("Take your " + amount + "$");
        }
        else
            System.out.println("Not enough money");
    }

    public void deposit(int id, double amount) {
        if (amount > 0) {
            accounts[id].deposit(amount);
            System.out.println("Accepted " + amount + "$");
        }
        else
            System.out.println("Incorrect amount");
    }

    public void showMainMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
    }
}