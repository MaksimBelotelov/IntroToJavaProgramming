package org.example.ch7;

/*
(Simulation: coupon collector’s problem) Coupon collector is a classic statistics
problem with many practical applications. The problem is to repeatedly pick
objects from a set of objects and find out how many picks are needed for all the
objects to be picked at least once. A variation of the problem is to pick cards from
a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
before you see one of each suit. Assume a picked card is placed back in the deck
before picking another. Write a program to simulate the number of picks needed
to get four cards from each suit and display the four cards picked (it is possible a
card may be picked twice).
 */
public class Ex7_24 {
    public static void main(String[] args) {
        final int SIZEOFDECK = 52;
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        boolean[] collected = new boolean[4];

        int pickCounter = 0;
        int collectedCounter = 0;

        while (collectedCounter < 4) {
            pickCounter++;
            int pickedCard = (int)(Math.random() * SIZEOFDECK);
            int suit = pickedCard / 13;
            if (collected[suit]) continue;
            collected[suit] = true;
            int rank = pickedCard % 13;
            System.out.println(ranks[rank] + " of " + suits[suit]);
            collectedCounter++;
        }
        System.out.println("Number of picks: " + pickCounter);
    }
}