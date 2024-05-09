package org.example.ch7;
/*
(Game: pick four cards) Write a program that picks four cards from a deck of 52
cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12,
and 11, respectively. Your program should display the number of picks that yields
the sum of 24.
 */
public class Ex7_29 {
    public static void main(String[] args) {
        final int SIZEOFDECK = 52;
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        int[] deck = new int[SIZEOFDECK];

        for (int i = 0; i < SIZEOFDECK; i++)
            deck[i] = i;

        shuffle(deck);

        int sum = 0;
        int pickCounter = 0;

        for (int j = 0; sum != 24; j += 4) {
            if(j == 52) {
                j = 0;
                shuffle(deck);
            }
            pickCounter++;
            sum = 0;
            for (int i = j; i < 4 + j; i++) {
                String suit = suits[deck[i] / 13];
                int rankValue = deck[i] % 13;
                String rank = ranks[rankValue];
                sum += rankValue;
                System.out.println(rank + " of " + suit);
            }
            System.out.println("The sum is " + sum);
            System.out.println("-----------------------------------------");
        }
        System.out.println("The number of picks is: " + pickCounter);

    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int ind = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[ind];
            deck[ind] = temp;
        }
    }
}