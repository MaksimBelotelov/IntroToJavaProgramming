package org.example.ch2;

import java.util.Scanner;

/*
    (Financial application: compound value) Suppose you save $100 each month into
    a savings account with an annual interest rate of 5%. Thus, the monthly interest
    rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and dis-
    plays the account value after the sixth month. (In Programming Exercise 5.30, you
    will use a loop to simplify the code and display the account value for any month.)
 */
public class Ex2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = scanner.nextDouble();
        double result = 0;
        for(int i = 0; i < 6; i++)
            result = (result + savingAmount) * (1 + (0.00417));
        System.out.println("After the sixth month, the account value is $" + result);
    }
}
