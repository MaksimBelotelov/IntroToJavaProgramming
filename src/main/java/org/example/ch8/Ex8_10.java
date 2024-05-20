package org.example.ch8;

/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s.
 */

public class Ex8_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = (int)(Math.random() * 2);


        System.out.println("Input matrix: ");

        int maxRowSum = 0;
        int maxRowIndex = 0;
        for (int i = 0; i < 4; i++) {
            int currentSum = 0;
            for (int j = 0; j < 4; j++) {
                currentSum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            if (currentSum > maxRowSum) {
                maxRowSum = currentSum;
                maxRowIndex = i;
            }
            System.out.println();
        }
        System.out.println("\nThe largest row index: " + maxRowIndex);

        int maxColumnSum = 0;
        int maxColumnIndex = 0;
        for (int j = 0; j < 4; j++) {
            int currentColumnSum = 0;
            for (int i = 0; i < 4; i++) {
                currentColumnSum += matrix[i][j];
            }
            if (currentColumnSum > maxColumnSum) {
                maxColumnSum = currentColumnSum;
                maxColumnIndex = j;
            }
        }
        System.out.print("The largest column index: " + maxColumnIndex);
    }
}