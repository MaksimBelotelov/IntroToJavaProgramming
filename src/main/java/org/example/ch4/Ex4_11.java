package org.example.ch4;

/*
    (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15
    and displays its corresponding hex number. For an incorrect input number, display invalid input.
 */

import java.util.Scanner;

public class Ex4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int integer = scanner.nextInt();
        if (integer >= 0 && integer < 16) {
            System.out.println("The hex value is " + Integer.toHexString(integer));
        }
        else
            System.out.println("Invalid input");
    }
}
