package org.example.ch5;

import java.util.Scanner;

/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly in-
terest rate is 0.05 / 12 = 0.00417. After the first month, the value in the
account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the an-
nual interest rate (e.g., 5), and the number of months (e.g., 6) then displays the
amount in the savings account after the given month.
 */
public class Ex5_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = (scanner.nextDouble()) / 100;
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();
        double monthlyInterestRate = interestRate / 12;
        double result = 0;

        for (int i = 0; i < months; i++) {
            result = (result + amount) * (1 + monthlyInterestRate);
            System.out.printf("Month %d: Amount: %.2f\n", i+1, result);
        }
    }
}
