package org.example.ch4;

/*
    (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
    ISBN number as a string.
 */

import java.util.Scanner;

public class Ex4_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String firstNineDigits = scanner.nextLine();

        if (firstNineDigits.length() != 9) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        int checksum = 0;
        for (int i = 1; i <= firstNineDigits.length(); i++) {
            int digit = firstNineDigits.charAt(i - 1) - '0';
            checksum += digit * i;
        }

        checksum %= 11;
        System.out.print("The 10-digit ISBN number is: ");
        System.out.println(firstNineDigits + ((checksum == 10) ? "X" : checksum));
    }
}
