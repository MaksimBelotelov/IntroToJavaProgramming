package org.example.ch8;

import java.util.Scanner;

/*
(Sum the major diagonal in a matrix) Write a method that sums all the numbers
in the major diagonal in an n * n matrix of double values using the following
header:

public static double sumMajorDiagonal(double[][] m)

Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal.
 */

public class Ex8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] inputMatrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                inputMatrix[i][j] = scanner.nextDouble();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(inputMatrix));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double result = 0;
        for (int i = 0; i < m.length; i++)
            result += m[i][i];

        return result;
    }
}
