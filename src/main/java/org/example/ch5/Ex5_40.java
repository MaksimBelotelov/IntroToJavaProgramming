package org.example.ch5;
/*
(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.
 */
public class Ex5_40 {
    public static void main(String[] args) {
        int headsCounter = 0;
        int tailsCounter = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int result = (int)(Math.random() * 2);
            if(result == 0) headsCounter++;
            else tailsCounter++;
        }
        System.out.println("Heads: " + headsCounter + "\nTails: " + tailsCounter);
    }
}
