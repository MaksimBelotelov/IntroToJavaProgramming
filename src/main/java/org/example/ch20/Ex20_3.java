package org.example.ch20;

/*
(Guessing the capitals) Rewrite Programming Exercise 8.37 to store the pairs
of states and capitals so that the questions are displayed randomly.
 */

import java.util.Map;
import java.util.Scanner;

public class Ex20_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> questions =
                Map.of("Alabama", "Montgomery",
                        "Alaska", "Juneau",
                        "Arizona", "Phoenix");
        int correctCounter = 0;

        for (var item: questions.entrySet()) {
            System.out.print("What is the capital of " +
                    item.getKey() + "? ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals(item.getValue().toLowerCase())) {
                System.out.println("Your answer is correct");
                correctCounter++;
            }
            else
                System.out.println("The correct answer is " +
                        item.getValue());
        }

        System.out.println("The correct count is " + correctCounter);
    }
}
