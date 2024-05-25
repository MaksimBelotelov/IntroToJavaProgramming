package org.example.ch7;

import java.util.Scanner;

/*
(Pattern recognition: consecutive four equal numbers) Write the following method
that tests whether the array has four consecutive numbers with the same value:

public static boolean isConsecutiveFour(int[] values)

Write a test program that prompts the user to enter a series of integers and dis-
plays it if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series.
 */
public class Ex7_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = scanner.nextInt();
        int[] values = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();

        int counter = 1;
        int currentValue = values[0];
        for (int i = 1; i < values.length && counter < 4; i++) {
            if (currentValue != values[i]) {
                currentValue = values[i];
                counter = 1;
            } else {
                counter++;
            }
        }

        if (counter == 4)
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
}
