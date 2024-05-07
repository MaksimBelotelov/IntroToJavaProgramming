package org.example.ch7;

import java.util.Scanner;

/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:

public static double average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter 10 integers, invokes the first
method, then displays the average value; prompts the user to enter 10 double
values, invokes the second method, then displays the average value.
 */
public class Ex7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++)
            intArray[i] = scanner.nextInt();

        System.out.print("Enter 10 doubles: ");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++)
            doubleArray[i] = scanner.nextDouble();

        System.out.print("Average of integers is:" + average(intArray));
        System.out.print("\nAverage of doubles is:" + average(doubleArray));
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return (sum * 1.0) / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }
}
