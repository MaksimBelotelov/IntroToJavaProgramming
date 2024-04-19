package org.example.ch3;

/*
    (Game: pick a card) Write a program that simulates picking a card from a deck
    of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */

public class Ex3_24 {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for(int i = 0; i < 100; i++) {
            int rank = (int) (Math.random() * 13);
            int suit = (int) (Math.random() * 4);
            System.out.println("The card you picked is " + ranks[rank] + " of " + suits[suit]);
        }
    }
}
