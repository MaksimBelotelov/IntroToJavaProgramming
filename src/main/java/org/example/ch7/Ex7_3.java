package org.example.ch7;

import java.util.Scanner;

/*
(Count occurrence of numbers) Write a program that reads the integers between
1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program: Note that if a number occurs more than one time, the
plural word “times” is used in the output. Numbers are displayed in increasing order.
 */
public class Ex7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        int[] numbers = new int[100];
        while ((input = scanner.nextInt()) != 0)
            numbers[input - 1]++;

        for (int i = 0; i < 100; i++)
            if(numbers[i] > 0)
                System.out.printf("%d occurs %d %s\n", (i + 1), numbers[i], (numbers[i] > 1) ? "times" : "time");
    }
}
