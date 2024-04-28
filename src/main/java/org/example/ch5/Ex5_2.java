package org.example.ch5;

/*
    (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five
    random subtraction questions. Revise the program to generate 10 random addition
    questions for two integers between 1 and 15. Display the correct count and
    test time.
 */

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);

            System.out.printf("What is %d + %d ? ", number1, number2);
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.printf("%d + %d should be %d\n", number1, number2, (number2 + number1));
            }
            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");
        }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 +
                    " seconds\n" + output);
    }
}
