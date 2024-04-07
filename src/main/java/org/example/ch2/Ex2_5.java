package org.example.ch2;

import java.util.Scanner;

/*
    (Financial application: calculate tips) Write a program that reads the subtotal
    and the gratuity rate, then computes the gratuity and total. For example, if the
    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
    as gratuity and $11.5 as total.
 */
public class Ex2_5 {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal and a gratuity rate:");
        Scanner scanner = new Scanner(System.in);
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + (subtotal + gratuity));
    }
}
