package org.example.ch8;

import java.util.Scanner;

/*
(Pattern recognition: four consecutive equal numbers) Write the following
method that tests whether a two-dimensional array has four consecutive numbers
of the same value, either horizontally, vertically, or diagonally:
public static boolean isConsecutiveFour(int[][] values)
 */
public class Ex8_19 {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.print("Number of columns:");
        int numberOfColumns = scanner.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        System.out.print("Enter the values:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        */
        int[][] matrix = {
                {2, 1, 0, 3, 1, 6, 0},
                {9, 2, 6, 8, 6, 9, 1},
                {3, 6, 3, 9, 1, 2, 9},
                {2, 5, 9, 1, 7, 9, 1},
                {1, 9, 1, 1, 2, 7, 7},
                {9, 3, 3, 2, 4, 8, 1}
        };

        System.out.println(isConsecutiveFour(matrix));
    }

    public static boolean isConsecutiveFour(int[][] values) {

        // rows
        for (int i = 0; i < values.length; i++) {
            int streakCounter = 1;
            int currentValue = values[i][0];
            for (int j = 1; j < values[0].length; j++) {
                if (values[i][j] == currentValue)
                    streakCounter++;
                else {
                    currentValue = values[i][j];
                    streakCounter = 1;
                }
                if(streakCounter == 4) return true;
            }
        }

        // columns
        for (int j = 0; j < values[0].length; j++) {
            int streakCounter = 1;
            int currentValue = values[0][j];
            for (int i = 1; i < values.length; i++) {
                if (values[i][j] == currentValue)
                    streakCounter++;
                else {
                    currentValue = values[i][j];
                    streakCounter = 1;
                }
                if (streakCounter == 4) return true;
            }
        }

        // main diagonal
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = 0; j <= values[0].length - 4; j++) {
                int currentValue = values[i][j];
                int streakCounter = 1;
                for (int k = 1; k < 4; k++) {
                    if (values[i + k][j + k] == currentValue) streakCounter++;
                    else break;
                }
                if (streakCounter == 4) return true;
            }
        }

        // sub-diagonal
        for (int i = values.length - 1; i >= 3; i--) {
            for (int j = 0; j <= values[0].length - 4; j++) {
                int currentValue = values[i][j];
                int streakCounter = 1;
                for (int k = 1; k < 4; k++) {
                    if (values[i - k][j + k] == currentValue) streakCounter++;
                    else break;
                }
                if (streakCounter == 4) return true;
            }
        }
        return false;
    }
}
