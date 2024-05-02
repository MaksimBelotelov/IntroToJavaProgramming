package org.example.ch5;

import java.util.Scanner;

/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer.
toOctalString(int) in this program.
 */
public class Ex5_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal integer:");
        int decimal = scanner.nextInt();
        String octal = "";
        while(decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        System.out.println(octal);
    }
}
