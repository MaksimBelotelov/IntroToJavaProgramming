package org.example.ch2;

/*
    (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
    to enter the number of years and display the population after the number of years.
    Use the hint in Programming Exercise 1.11 for this program.
 */

import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        int seconds = 365 * 24 * 3600 * years;
        int births = seconds / 7;
        int deaths = seconds / 13;
        int imm = seconds / 45;
        System.out.println("The population in " + years + " years is " + (312_032_486 + births + imm - deaths));
    }
}
