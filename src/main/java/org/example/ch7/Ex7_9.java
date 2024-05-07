package org.example.ch7;

import java.util.Scanner;

/*
(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
		 Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:
 */
public class Ex7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            arr[i] = scanner.nextDouble();
        System.out.println("The minimum number is: " + min(arr));
    }

    public static double min(double[] array) {
        double min = array[0];
        for(int i = 1; i < array.length; i++) {
            min = Double.min(min, array[i]);
        }
        return min;
    }
}
