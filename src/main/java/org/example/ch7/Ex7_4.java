package org.example.ch7;

/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.
 */

import java.util.Scanner;

public class Ex7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int counter = 0;
        int total = 0;
        System.out.print("Enter the scores (enter negative for finish): ");
        int[] scores = new int[100];
        while ((input = scanner.nextInt()) >= 0) {
            total += input;
            scores[counter++] = input;
        }

        double avg = (total * 1.0) / counter;

        int belowCounter = 0;
        int upperCounter = 0;
        for (int i = 0; i < counter; i++) {
            if (scores[i] > avg) upperCounter++;
            else belowCounter++;
        }
        System.out.println("Below the average: " + belowCounter);
        System.out.println("Upper the average: " + upperCounter);
    }
}
