package org.example.ch7;

import java.util.Scanner;

/*
(Math: combinations) Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10 numbers.
 */
public class Ex7_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < integers.length; i++)
            integers[i] = scanner.nextInt();

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (i == j) continue;
                System.out.println(integers[i] + " " + integers[j]);
            }
        }
    }
}
