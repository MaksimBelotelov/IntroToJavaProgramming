package org.example.ch7;

/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in 10 integers, invokes the method, and displays
the distinct numbers separated by exactly one space.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] input = new int[10];
        for (int i = 0; i < 10; i++)
            input[i] = scanner.nextInt();

        int[] result = eliminateDuplicates(input);
        if (result != null) {
            System.out.print("The distinct numbers are: ");
            System.out.print(result[0]);
            for (int i = 1; i < result.length; i++) {
                System.out.print(" " + result[i]);
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] result = new int[list.length];
        if(list.length > 0) {
            result[0] = list[0];
            int counter = 1;
            for (int i = 1; i < list.length; i++) {
                int current = list[i];
                boolean isDistinct = true;
                for (int j = 0; j < result.length; j++) {
                    if (current == result[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) result[counter++] = current;
            }
            return Arrays.copyOf(result, counter);
        }
        else
            return null;
    }
}
