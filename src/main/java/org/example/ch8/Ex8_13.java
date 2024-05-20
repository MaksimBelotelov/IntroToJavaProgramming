package org.example.ch8;

import java.util.Scanner;

/*
(Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array:

public static int[] locateLargest(double[][] a)

The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. If there are more than one largest element, return the
smallest row index and then the smallest column index.
Write a test program that prompts the user to enter a two-dimensional array and
displays the location of the largest element in the array.
 */
public class Ex8_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rowsNumber = scanner.nextInt();
        int columnsNumber = scanner.nextInt();
        double[][] array = new double[rowsNumber][columnsNumber];
        System.out.println("Enter the array: ");
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        int[] result = locateLargest(array);

        System.out.printf("The location of the largest element is at (%d, %d)", result[0], result[1]);
    }
    public static int[] locateLargest(double[][] a) {
        int[] coordinates = new int[2];

        double largestElementValue = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > largestElementValue) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                    largestElementValue = a[i][j];
                }
            }
        }
        return coordinates;
    }
}