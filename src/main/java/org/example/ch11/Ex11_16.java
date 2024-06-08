package org.example.ch11;

/*
(Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user
if an answer is entered again. (Hint: use an array list to store answers.)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answersList = new ArrayList<>();

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if (answersList.contains(answer))
                System.out.println("You already entered " + answer);
            else
                answersList.add(answer);

            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
