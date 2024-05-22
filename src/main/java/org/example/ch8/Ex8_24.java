package org.example.ch8;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;

/*
(Check Sudoku solution) Listing 8.4 checks whether a solution is valid by check-
ing whether every number is valid in the board. Rewrite the program by checking
whether every row, every column, and every small box has the numbers 1 to 9.
 */
public class Ex8_24 {
    public static void main(String[] args) {
        int[][] grid = {
                {9,6,3, 1,7,4, 2,5,8},
                {1,7,8, 3,2,5, 6,4,9},
                {2,5,4, 6,3,9, 7,8,1},

                {8,2,1, 4,3,7, 5,9,6},
                {4,9,6, 8,5,2, 3,1,7},
                {7,3,5, 9,6,1, 8,2,4},

                {5,8,9, 7,1,3, 4,6,2},
                {3,1,7, 2,4,6, 9,8,5},
                {6,4,2, 5,9,8, 1,7,3}
        };

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

//    public static int[][] readASolution() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a Sudoku puzzle solution:");
//        int[][] grid = new int[9][9];
//        for (int i = 0; i < 9; i++)
//            for (int j = 0; j < 9; j++)
//                grid[i][j] = input.nextInt();
//
//        return grid;
//    }

    public static boolean isValid(int[][] grid) {

        //rows
        for (int i = 0; i < grid.length; i++) {
            if (!isValidRowOrColumn(grid[i])) {
                System.out.println("Invalid row " + i);
                return false;
            }
        }

        //sqr
        for (int i = 0; i < grid.length; i+=3) {
            for (int j = 0; j < grid[0].length; j+=3) {
                int[] square = new int[9];
                int index = 0;
                for (int m = i; m < i + 3; m++) {
                    for (int n = j; n < j + 3; n++) {
                        square[index++] = grid[m][n];
                    }
                }
                if (!isValidRowOrColumn(square)) {
                    System.out.println("Invalid square (" + i + "," + j + ")");
                    return false;
                }
            }
        }

        //columns
        for (int j = 0; j < grid[0].length; j++) {
            int[] column = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][j];
            }
            if (!isValidRowOrColumn(column)) {
                System.out.println("Invalid column " + j);
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRowOrColumn(int[] row) {
        int[] rowCopy = new int[row.length];
        arraycopy(row, 0, rowCopy,0, row.length);
        Arrays.sort(rowCopy);
        for (int i = 1; i <= 9; i++)
            if (rowCopy[i - 1] != i)
                return false;
        return true;
    }
}
