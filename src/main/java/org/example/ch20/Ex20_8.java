package org.example.ch20;

/*
(Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000
award if two digits from the user input are in the lottery number. (Hint: Sort
the three digits in the lottery number and three digits in the user input into two
lists, and use the Collection’s containsAll method to check whether the
two digits in the user input are in the lottery number.)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20_8 {
    public static void main(String[] args) {
        List<Integer> lotteryDigits = new ArrayList<>(3);

        for (int i = 0; i < 3; i++)
            lotteryDigits.add((int)(Math.random() * 10));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        String guess = scanner.nextLine();
        List<Integer> guessDigits = new ArrayList<>(3);

        System.out.print("Lottery number: ");

        for (var digit: lotteryDigits)
            System.out.print(digit);
        System.out.println();

        for (int i = 0; i < guess.length(); i++)
            guessDigits.add(Character.getNumericValue(guess.charAt(i)));

        if (guessDigits.equals(lotteryDigits))
            System.out.println("Exact match: you win $10,000");
        else {
            int count = 0;
            for (Integer digit : guessDigits)
                if (lotteryDigits.contains(digit))
                    count++;

            switch (count) {
                case 1:
                    System.out.println("One digit match: you win $1,000");
                    break;
                case 2:
                    System.out.println("Two digits match: you win $2,000");
                    break;
                case 3:
                    System.out.println("Match all digits: you win $3,000");
                    break;
                default:
                    System.out.println("Sorry, no matches");
            }
        }
    }
}
