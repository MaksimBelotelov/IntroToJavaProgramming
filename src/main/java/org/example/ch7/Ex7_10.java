package org.example.ch7;

/*
(Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
		 Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the index of the smallest element, and displays the index.
 */

import java.util.Scanner;

public class Ex7_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            arr[i] = scanner.nextDouble();
        System.out.println("The minimum number index is: " + indexOfSmallestElement(arr));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int indexOfMin = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
