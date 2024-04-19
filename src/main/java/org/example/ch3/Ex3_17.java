package org.example.ch3;

/*
    (Game: scissor, rock, paper) Write a program that plays the popular scissor–
    rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
    a paper can wrap a rock.) The program randomly generates a number 0, 1, or
    2 representing scissor, rock, and paper. The program prompts the user to enter
    a number 0, 1, or 2 and displays a message indicating whether the user or the
    computer wins, loses, or draws.
 */

import java.util.Scanner;

public class Ex3_17 {
    public static void main(String[] args) {
        String[] items = {"scissor", "rock", "paper"};
        Scanner scanner = new Scanner(System.in);

        System.out.print(items[0] + " (0), " + items[1] + " (1), " + items[2] + " (2): ");
        int playerChoice = scanner.nextInt();
        int computerChoice = (int)(Math.random() * 3);
        System.out.print("The computer is " + items[computerChoice] + ". ");
        System.out.print("You are " + items[playerChoice] + ". ");
        if (playerChoice == computerChoice) System.out.print("It's a draw");
        else if (playerChoice == 0 && computerChoice == 1 || playerChoice == 1 && computerChoice == 2 ||
            playerChoice == 2 && computerChoice == 0)
            System.out.println("You lose");
        else
            System.out.println("You won");
    }
}
