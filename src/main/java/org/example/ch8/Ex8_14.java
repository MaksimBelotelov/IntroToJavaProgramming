package org.example.ch8;

import java.util.Scanner;

/*
(Explore matrix) Write a program that prompts the user to enter the length of a
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
the program:
 */
public class Ex8_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // rows
        for (int i = 0; i < size; i++) {
            int sumInRow = 0;
            for (int j = 0; j < size; j++)
                sumInRow += matrix[i][j];
            if (sumInRow == 0)
                System.out.println("All 0s on row " + i);
            else if (sumInRow == size)
                System.out.println("All 1s on row " + i);
            else System.out.println("No same numbers in row");
        }

        // columns
        for (int j = 0; j < size; j++) {
            int sumInColumn = 0;
            for (int i = 0; i < size; i++) {
                sumInColumn += matrix[i][j];
            }
            if (sumInColumn == 0)
                System.out.println("All 0s on column " + j);
            else if (sumInColumn == size)
                System.out.println("All 1s on column " + j);
            else
                System.out.println("No same numbers in column");
        }

        // diagonals
        int diagonalSum = 0;
        int subDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
            subDiagonalSum += matrix[size - 1 - i][i];
        }
        if (diagonalSum == matrix.length)
            System.out.println("All 1s on main diagonal");
        else if (diagonalSum == 0)
            System.out.println("All 0s on main diagonal");
        else
            System.out.println("No same numbers on main diagonal");
        if (subDiagonalSum == matrix.length)
            System.out.println("All 1s on sub-diagonal");
        else if (subDiagonalSum == 0)
            System.out.println("All 0s on sub-diagonal");
        else
            System.out.println("No same numbers on sub-diagonal");
    }
}