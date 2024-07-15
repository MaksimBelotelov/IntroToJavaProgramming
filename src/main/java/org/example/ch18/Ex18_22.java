package org.example.ch18;

/*
(Decimal to hex) Write a recursive method that converts a decimal number into
a hex number as a string. The method header is

public static String dec2Hex(int value)

Write a test program that prompts the user to enter a decimal number and displays
its hex equivalent.
*/

import java.util.Scanner;

public class Ex18_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int number = scanner.nextInt();
        System.out.println("Hex: " + dec2Hex(number));
    }

    public static String dec2Hex(int value) {
        if (value == 0)
            return "";
        else {
            return dec2Hex(value / 16) +
                    Integer.toHexString(value % 16);
        }
    }
}
