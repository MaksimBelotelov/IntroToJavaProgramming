package org.example.ch8;

import java.util.Scanner;

/*
(Algebra: add two matrices) Write a method to add two matrices. The header of
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
 */
public class Ex8_5 {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        double[][] matrix1 = new double[SIZE][SIZE];
        double[][] matrix2 = new double[SIZE][SIZE];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                matrix1[i][j] = scanner.nextDouble();
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                matrix2[i][j] = scanner.nextDouble();
        }

        double[][] resultMatrix = addMatrix(matrix1, matrix2);

        print(matrix1, matrix2, resultMatrix);
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void print(double[][] matrix1, double[][] matrix2, double[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%4.1f ", matrix1[i][j]);
            }

            if (i == matrix1.length / 2)
                System.out.print("  " + "+" + "  ");
            else
                System.out.print("     ");

            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%4.1f ", matrix2[i][j]);
            }

            if (i == matrix2.length / 2)
                System.out.print("  " + "=" + "  ");
            else
                System.out.print("     ");

            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4.1f ", result[i][j]);
            }

            System.out.println();
        }
    }
}
