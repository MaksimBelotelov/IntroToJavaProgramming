package org.example.ch8;
/*
(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.
 */
public class Ex8_22 {
    public static void main(String[] args) {
        final int SIZE = 6;
        int[][] matrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                matrix[i][j] = (int)(Math.random() * 2);

        printMatrix(matrix);
        System.out.println(checkEvenRowsAndColumns(matrix));
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkEvenRowsAndColumns(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < m[0].length; j++)
                rowSum += m[i][j];
            if (rowSum % 2 != 0) return false;
        }

        for (int j = 0; j < m[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < m.length; i++)
                columnSum += m[i][j];
            if (columnSum % 2 != 0) return false;
        }
        return true;
    }
}