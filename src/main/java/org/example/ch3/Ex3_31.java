package org.example.ch3;

/*
    (Financials: currency exchange) Write a program that prompts the user to enter
    the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
    user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
    from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
    dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
*/

import java.util.Scanner;

public class Ex3_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conv = scanner.nextInt();
        if (conv == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollars = scanner.nextDouble();
            System.out.printf("$%.2f is %.2f yuan", dollars, dollars * exchangeRate);
        }
        else if (conv == 1){
            System.out.print("Enter the RMB amount: ");
            double rmb = scanner.nextDouble();
            System.out.printf("%.2f yuan is $%.2f", rmb, rmb / exchangeRate);
        }
        else
            System.out.println("Incorrect input");
    }
}
