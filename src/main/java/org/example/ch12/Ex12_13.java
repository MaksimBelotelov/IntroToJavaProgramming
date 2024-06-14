package org.example.ch12;

/*
(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument, as shown in Figure 12.13.
*/

import java.io.File;
import java.util.Scanner;

public class Ex12_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error! Usage: java Exercise12_12 Test.java");
            System.exit(1);
        }

        File file = new File(args[0]);
        try (Scanner scanner = new Scanner(file)) {
            int linesCounter = 0;
            int wordsCounter = 0;
            int charsCounter = 0;

            while (scanner.hasNext()) {
                linesCounter++;
                String currentString = scanner.nextLine();
                String[] words = currentString.split(" ");
                wordsCounter += words.length;
                charsCounter += currentString.length();
            }

            System.out.println("File " + args[0] + " has:");
            System.out.println(charsCounter + " characters");
            System.out.println(wordsCounter + " words");
            System.out.println(linesCounter + " lines");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}