package org.example.ch7;

/*
 (Random number chooser) Write the following method that returns a random
number between start and end, excluding the numbers.
public static int getRandom(int start, int end, int... numbers)
 */

public class Ex7_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            System.out.printf("%4d", getRandom(1, 100,  4, 8, 95, 93));
            if (i % 15 == 0)
                System.out.println();
        }
    }

    public static int getRandom(int start, int end, int... numbers) {
        boolean isCorrect = false;
        int number = 0;
        while(!isCorrect) {
            number = (int)(start + Math.random() * end);
            isCorrect = true;
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        return number;
    }
}
