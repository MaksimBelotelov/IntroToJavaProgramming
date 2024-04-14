package org.example.ch2;

/*
    (Financial application: calculate interest) If you know the balance and the an-
    nual percentage interest rate, you can compute the interest on the next monthly
    payment using the following formula:
    interest = balance * (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate
    and displays the interest for the next month.
 */

import java.util.Scanner;

public class Ex2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
