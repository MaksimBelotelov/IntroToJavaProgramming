package org.example.ch8;

import java.util.Scanner;

/*
(Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][] multiplyMatrix(double[][] a, double[][] b)
 */
public class Ex8_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 3;
        double[][] m1 = new double[SIZE][SIZE];
        double[][] m2 = new double[SIZE][SIZE];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                m1[i][j] = scanner.nextDouble();
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                m2[i][j] = scanner.nextDouble();
        }

        double[][] resultMatrix = multiplyMatrix(m1, m2);
        print(m1, m2, resultMatrix);
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[i].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
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
                System.out.print("  " + "x" + "  ");
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
