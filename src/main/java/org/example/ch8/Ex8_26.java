package org.example.ch8;

import java.util.Arrays;

/*
(Row sorting) Implement the following method to sort the rows in a two-
dimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix.
 */
public class Ex8_26 {
    public static void main(String[] args) {
        double[][] array = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.4}
        };

        System.out.println("The row-sorted array is");
        double[][] res = sortRows(array);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        double[][] result = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                result[i][j] = m[i][j];
            Arrays.sort(result[i]);
        }
        return result;
    }
}
