package org.example.ch8;

import java.util.Arrays;
import java.util.Scanner;

/*
(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
cell was flipped. Your program should prompt the user to enter a 6-by-6 array
with 0s and 1s and find the first row r and first column c where the even number
of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
is at (r, c).
 */
public class Ex8_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 6;
        int[][] matrix = new int[SIZE][SIZE];

        System.out.print("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                matrix[i][j] = scanner.nextInt();

        System.out.println("The flipped cell is at " + Arrays.toString(findFirstNotEven(matrix)));
    }

    public static int[] findFirstNotEven(int[][] m) {
        int[] result = new int[2];
        int row = -1;
        int column = -1;

        for (int i = 0; i < m.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < m[0].length; j++)
                rowSum += m[i][j];
            if (rowSum % 2 != 0) {
                row = i;
                break;
            }
        }

        for (int j = 0; j < m[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < m.length; i++)
                columnSum += m[i][j];
            if (columnSum % 2 != 0) {
                column = j;
                break;
            }
        }
        result[0] = row;
        result[1] = column;
        return result;
    }
}