package org.example.ch5;

/*
(Financial application: loan amortization schedule) The monthly payment for a given
loan pays the principal and the interest. The monthly interest is computed by multiply-
ing the monthly interest rate and the balance (the remaining principal). The principal
paid for the month is therefore the monthly payment minus the monthly interest. Write
a program that lets the user enter the loan amount, number of years, and interest rate
then displays the amortization schedule for the loan.
 */

import java.util.Scanner;

public class Ex5_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter the loan period in number of years: ");
        int period = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = (scanner.nextDouble()) / 100;
        double monthlyInterestRate = interestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (Math.pow(1 / (1 + monthlyInterestRate), period * 12)));

        double balance = loanAmount;
        double total = monthlyPayment * 12 * period;
        System.out.printf("Total payment: %.2f\n", total);
        System.out.printf("Monthly payment: %.2f\n", monthlyPayment);

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Payment", "Interest", "Principal", "Balance");
        for (int i = 1; i <= period * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;
            System.out.printf("%-20d%-20.2f%-20.2f%-20.2f\n", i, interest, principal, balance);
        }
    }
}
