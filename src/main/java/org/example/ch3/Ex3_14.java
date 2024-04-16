package org.example.ch3;

/*
    (Game: heads or tails) Write a program that lets the user guess whether the flip
    of a coin results in heads or tails. The program randomly generates an integer
    0 or 1, which represents head or tail. The program prompts the user to enter a
    guess, and reports whether the guess is correct or incorrect.
 */

import java.util.Scanner;

public class Ex3_14 {
    public static void main(String[] args) {
        int dropResult = (int)(Math.random() * 2);
        System.out.print("Try to guess 0 or 1: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        System.out.println(guess == dropResult);
    }
}
