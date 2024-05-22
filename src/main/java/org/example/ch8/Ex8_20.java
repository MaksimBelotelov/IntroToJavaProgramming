package org.example.ch8;

import java.util.Scanner;

/*
(Game: connect four) Connect four is a two-player board game in which the
players alternately drop colored disks into a seven-column, six-row vertically
suspended grid, as shown below.
 */
public class Ex8_20 {
    static int[][] board = new int[6][7];
    static int currentPlayer;
    static boolean isGameOver;

    public static void main(String[] args) {
        startGame();
        while (!isGameOver) {
            makeTurn();
            printBoard();
            if (isWinner(board)) {
                isGameOver = true;
                System.out.println("----------------------------------------------------------------");
                System.out.println("The " + ((currentPlayer == 1) ? "Red" : "Yellow") + " player won");
            }
            else
                currentPlayer = 3 - currentPlayer;
        }
    }

    public static void startGame() {
        currentPlayer = 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 0;
            }
        }
        isGameOver = false;
        printBoard();
    }

    public static String updateCellView(int value) {
        String text = " ";
        if (value == 1) text = "R";
        else if (value == 2) text = "Y";
        return text;
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + updateCellView(board[i][j]) + " |");
            }
            System.out.println();
        }
        System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 |");
    }

    public static void makeTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Drop a " + ((currentPlayer == 1) ? "Red" : "Yellow") + " disk at column (0-6): ");
        int currentColumn = scanner.nextInt();
        int indexOfRowToAdd = board.length - 1;
        while (board[indexOfRowToAdd][currentColumn] != 0) indexOfRowToAdd--;
        board[indexOfRowToAdd][currentColumn] = currentPlayer;
    }

    public static boolean isWinner(int[][] values) {
        // rows
        for (int i = 0; i < values.length; i++) {
            int streakCounter = 1;
            int currentValue = values[i][0];
            for (int j = 1; j < values[0].length; j++) {
                if (values[i][j] == currentValue && currentValue != 0)
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
                if (values[i][j] == currentValue && currentValue != 0)
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
                    if (values[i + k][j + k] == currentValue && currentValue != 0) streakCounter++;
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
                    if (values[i - k][j + k] == currentValue && currentValue != 0) streakCounter++;
                    else break;
                }
                if (streakCounter == 4) return true;
            }
        }
        return false;
    }
}