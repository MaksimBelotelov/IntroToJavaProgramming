package org.example.ch5;

import java.util.Scanner;

/*
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.
toBinaryString(int) in this program.
 */
public class Ex5_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal integer:");
        int decimal = scanner.nextInt();
        String binary = "";
        while(decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println(binary);
    }
}
