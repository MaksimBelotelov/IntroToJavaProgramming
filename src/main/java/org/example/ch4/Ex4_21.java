package org.example.ch4;

/*
    (Check SSN) Write a program that prompts the user to enter a Social Security
    number in the format DDD-DD-DDDD, where D is a digit. Your program should
    check whether the input is valid.
 */

import java.util.Scanner;

public class Ex4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = scanner.nextLine();
        if (ssn.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]"))
            System.out.println(ssn + " is a valid social security number");
        else
            System.out.println(ssn + " is an invalid social security number");
    }
}
