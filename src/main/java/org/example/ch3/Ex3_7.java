package org.example.ch3;

/*
    (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
    java, to display the nonzero denominations only, using singular words for single
    units such as 1 dollar and 1 penny, and plural words for more than one unit such
    as 2 dollars and 3 pennies.
 */

import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = scanner.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + ((numberOfOneDollars > 1) ? "dollars" : "dollar"));
        System.out.println(" " + numberOfQuarters + ((numberOfQuarters > 1) ? "quarters" : "quarter"));
        System.out.println(" " + numberOfDimes + ((numberOfDimes > 1) ? "dimes" : "dime"));
        System.out.println(" " + numberOfNickels + ((numberOfNickels > 1) ? "nickels" : "nickel"));
        System.out.println(" " + numberOfPennies + ((numberOfPennies > 1) ? "pennies" : "penny"));
    }
}
