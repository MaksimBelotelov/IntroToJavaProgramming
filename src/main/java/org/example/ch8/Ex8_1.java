package org.example.ch8;

import java.util.Scanner;

/*
(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:

public static double sumColumn(double[][] m, int columnIndex)

 Write a test program that reads a 3-by-4 matrix and displays the sum of each
column.
 */
public class Ex8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row by row:");
        double[][] inputMatrix = new double[3][4];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                inputMatrix[i][j] = scanner.nextDouble();

        for (int j = 0; j < 4; j++)
            System.out.printf("Sum of the elements at column %d is %f\n", j, sumColumn(inputMatrix, j));
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][columnIndex];

        return sum;
    }
}
