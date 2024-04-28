package org.example.ch5;

/*
     (Count positive and negative numbers and compute the average of numbers)
    Write a program that reads an unspecified number of integers, determines how
    many positive and negative values have been read, and computes the total and av-
    erage of the input values (not counting zeros). Your program ends with the input
    0. Display the average as a floating-point number.
 */

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        double total = 0;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        while ((number = scanner.nextInt()) != 0) {
            total += number;
            if (number > 0) numberOfPositives++;
            else numberOfNegatives++;
        }

        double average = total / (numberOfPositives + numberOfNegatives);
        System.out.println("The number of positives is " + numberOfPositives);
        System.out.println("The number of negatives is " + numberOfNegatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
