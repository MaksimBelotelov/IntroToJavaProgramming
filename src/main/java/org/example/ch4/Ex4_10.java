package org.example.ch4;

/*
    (Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
    enter the character Y for Yes and N for No, rather than entering 1 for Yes and 0 for
    No.
 */

import java.util.Scanner;

public class Ex4_10 {
    public static void main(String[] args) {
        String[] sets = {
                "01 03 05 07\n" +
                "09 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31",

                "02 03 06 07\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31",

                "04 05 06 07\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31",

                "08 09 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31",

                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31"
        };

        int day = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Is your birthday in Set%d?\n", i + 1);
            System.out.print(sets[i]);
            System.out.print("\nEnter N for No or Y for Yes: ");
            String answer = scanner.nextLine();
            if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
                String substring = sets[i].substring(0, 2);
                day += Integer.parseInt(substring);
            }
        }

        System.out.println("\nYour birthday is " + day + "!");
    }
}
