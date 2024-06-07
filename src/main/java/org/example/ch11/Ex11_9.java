package org.example.ch11;

import java.util.ArrayList;
import java.util.Scanner;

/*
(Largest rows and columns) Write a program that randomly fills in 0 s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.)
 */
public class Ex11_9 {
    public static void main(String[] args) {
        System.out.print("Enter the array size n: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("The random array is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> rowIndexes = new ArrayList<>();
        ArrayList<Integer> columnIndexes = new ArrayList<>();

        int maxRowAmount = 0;
        int maxColAmount = 0;

        for (int i = 0; i < size; i++) {
            int rowCounter = 0;
            int columnCounter = 0;

            for (int j = 0; j < size; j++) {
                rowCounter += matrix[i][j];
                columnCounter += matrix[j][i];
            }

            if (rowCounter > maxRowAmount) {
                rowIndexes.clear();
                rowIndexes.add(i);
                maxRowAmount = rowCounter;
            } else if (rowCounter == maxRowAmount)
                rowIndexes.add(i);

            if (columnCounter > maxColAmount) {
               columnIndexes.clear();
               columnIndexes.add(i);
               maxColAmount = columnCounter;
            } else if (columnCounter == maxColAmount)
                columnIndexes.add(i);
        }

        System.out.println("The largest row index: " + rowIndexes);
        System.out.println("The largest column index: " + columnIndexes);
    }
}