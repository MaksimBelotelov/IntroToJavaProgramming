package org.example.ch4;

/*
    (Hex to binary) Write a program that prompts the user to enter a hex digit and
    displays its corresponding binary number in four digits. For example, hex digit 7
    is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
    an incorrect input, display invalid input.
 */

import java.util.Scanner;

public class Ex4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String input = scanner.nextLine();
        char digit = input.charAt(0);
        if (Character.isDigit(digit) || (digit >= 'a' && digit <= 'f') || (digit >= 'A' && digit <= 'F')) {
            int intDigit = Integer.parseInt(input, 16);
            System.out.print("The binary value is ");
            String result = String.format("%4s", Integer.toBinaryString(intDigit));
            System.out.println(result.replace(' ', '0'));
        }
        else
            System.out.println("Invalid input");
    }
}
