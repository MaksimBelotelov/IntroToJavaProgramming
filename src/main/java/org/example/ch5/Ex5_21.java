package org.example.ch5;

/*
(Financial application: compare loans with various interest rates) Write a pro-
gram that lets the user enter the loan amount and loan period in number of years,
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8.
 */

import java.util.Scanner;

public class Ex5_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter the loan period in number of years: ");
        int period = scanner.nextInt();
        System.out.printf("%20s%20s%20s\n","Interest Rate","Monthly Payment", "Total Payment");
        double interestRate = 0.05;
        for (int i = 0; i < 25; i++) {
            double monthlyInterestRate = interestRate / 12;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, period * 12));
            double totalPayment = monthlyPayment * period * 12;

            System.out.printf("%-20.3f%-20.2f%-20.2f\n", interestRate * 100, monthlyPayment, totalPayment);
            interestRate += 0.00125;
        }
    }
}
