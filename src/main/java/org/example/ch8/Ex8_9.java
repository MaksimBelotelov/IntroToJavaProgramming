package org.example.ch8;

import java.util.Scanner;

/*
(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either X
or O). When one player has placed three tokens in a horizontal, vertical, or diago-
nal row on the grid, the game is over and that player has won. A draw (no winner)
occurs when all the cells on the grid have been filled with tokens and neither
player has achieved a win. Create a program for playing a tic-tac-toe game.
The program prompts two players to alternately enter an X token and O token.
Whenever a token is entered, the program redisplays the board on the console and
determines the status of the game (win, draw, or continue).
 */
public class Ex8_9 {
    int[][] field = new int[3][3];
    int currentPlayer;
    boolean isGameOver;
    Scanner scanner = new Scanner(System.in);
    int turnsCounter;
    public static void main(String[] args) {
        Ex8_9 ex = new Ex8_9();
        ex.startGame();
        ex.updateView();

        while(!ex.isGameOver && ex.turnsCounter < 9) {
            ex.makeTurn();
            ex.updateView();
        }

        if (ex.isGameOver)
            System.out.println("Game over. Player " + ex.updateCellView(ex.currentPlayer) + " is winner");
        else
            System.out.println("Game over. Drow. There is no winner");
    }

    public void startGame() {
        currentPlayer = 1;
        turnsCounter = 0;
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field.length; j++)
                field[i][j] = 0;
        isGameOver = false;
    }

    // Поместить значение в ячейку
    public void setCellValue(int x, int y) {
        if (field[y][x] != 0) return;
        field[y][x] = currentPlayer;

    }

    public String updateCellView(int value) {
        String text = " ";
        if (value == 1) text = "X";
        else if (value == 2) text = "O";
        return text;
    }

    //Отображает все ячейки
    public void updateView() {
        for (int i = 0; i < field.length; i++) {
            System.out.println("\n-------------------");
            System.out.print("|");
            for (int j = 0; j < field.length; j++) {
                System.out.print("  " + updateCellView(field[i][j]) + "  |");
            }
        }
        System.out.println("\n-------------------");
    }

    public void makeTurn() {
        System.out.print("Enter a row for player " +
                (((currentPlayer == 1) ? "X" : "O") + ":"));
        int currentRow = scanner.nextInt();
        System.out.print("Enter a column for player " +
                (((currentPlayer == 1) ? "X" : "O") + ":"));
        int currentColumn = scanner.nextInt();
        if (field[currentRow][currentColumn] != 0) return;

        setCellValue(currentColumn, currentRow);

        if (field[currentRow][0] == currentPlayer &&
                field[currentRow][1] == currentPlayer &&
                field[currentRow][2] == currentPlayer)
            isGameOver = true;
        else if (field[0][currentColumn] == currentPlayer &&
                field[1][currentColumn] == currentPlayer &&
                field[2][currentColumn] == currentPlayer)
            isGameOver = true;
        else if (field[0][0] == currentPlayer && field[1][1] == currentPlayer && field[2][2] == currentPlayer)
            isGameOver = true;
        else if (field[0][2] == currentPlayer && field[1][1] == currentPlayer && field[2][0] == currentPlayer)
            isGameOver = true;
        else
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        turnsCounter++;
    }
}
