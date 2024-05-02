package org.example.ch5;

import java.util.Scanner;

/*
(Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer.
 */
public class Ex5_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        String result = "";
        for (int i = 15; i >= 0; i--) {
            int shifted = integer >> i;
            int bit = shifted & 1;
            result += bit;
        }
        System.out.println("The bits are: " + result);
    }
}
