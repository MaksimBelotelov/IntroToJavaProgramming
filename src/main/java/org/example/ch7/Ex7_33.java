package org.example.ch7;

/*
(Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
the animal names.
 */

import java.util.Scanner;

public class Ex7_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
            "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(animals[year % 12]);
    }
}
