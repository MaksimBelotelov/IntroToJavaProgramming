package org.example.ch21;

/*
(Display nonduplicate words in ascending order) Write a program that reads
words from a text file and displays all the nonduplicate words in ascending order.
The text file is passed as a command-line argument.
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex21_2 {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        Set<String> words = new TreeSet<>();

        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNext()) {
                String[] tokens = scanner.nextLine().split("\\W+");
                words.addAll(Arrays.asList(tokens));
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (var word: words) {
            System.out.println(word);
        }
    }
}
