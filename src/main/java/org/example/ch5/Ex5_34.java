package org.example.ch5;

import java.util.Scanner;

/*
(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
plays the scissor–rock–paper game. Revise the program to let the user continu-
ously play until either the user or the computer wins more than two times than its
opponent.
 */
public class Ex5_34 {
    public static void main(String[] args) {
        String[] items = {"scissor", "rock", "paper"};
        Scanner scanner = new Scanner(System.in);
        int botCounter = 0;
        int playerCounter = 0;

        while (botCounter < 2 && playerCounter < 2) {
            System.out.print(items[0] + " (0), " + items[1] + " (1), " + items[2] + " (2): ");
            int playerChoice = scanner.nextInt();
            int computerChoice = (int) (Math.random() * 3);
            System.out.print("The computer is " + items[computerChoice] + ". ");
            System.out.print("You are " + items[playerChoice] + ". ");
            if (playerChoice == computerChoice) System.out.println("It's a draw");
            else if (playerChoice == 0 && computerChoice == 1 || playerChoice == 1 && computerChoice == 2 ||
                    playerChoice == 2 && computerChoice == 0) {
                System.out.println("You lose");
                botCounter++;
            } else {
                System.out.println("You won");
                playerCounter++;
            }
        }
    }
}
