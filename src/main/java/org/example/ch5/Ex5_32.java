package org.example.ch5;

import java.util.Scanner;

/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two-
digit number. The two digits in the number are distinct. (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different
from the first digit.)
 */
public class Ex5_32 {
    public static void main(String[] args) {
        int firstDigit = (int)(Math.random() * 10);
        int secondDigit = firstDigit;
        while (secondDigit == firstDigit)
            secondDigit = (int)(Math.random() * 10);

        int lottery = (firstDigit * 10) + secondDigit;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
