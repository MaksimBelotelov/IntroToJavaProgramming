package org.example.ch18;

import java.util.Scanner;

/*
(Decimal to binary) Write a recursive method that converts a decimal number
into a binary number as a string. The method header is

public static String dec2Bin(int value)

Write a test program that prompts the user to enter a decimal number and displays
its binary equivalent.
 */
public class Ex18_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int input = scanner.nextInt();
        System.out.println("Binary: " + dec2Bin(input));
    }

    public static String dec2Bin(int value) {
        if (value == 0)
            return "";
        else
            return dec2Bin(value / 2) + value % 2;
    }
}
