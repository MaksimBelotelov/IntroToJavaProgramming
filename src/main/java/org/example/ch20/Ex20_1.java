package org.example.ch20;

/*
(Display words in ascending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in ascending
alphabetical order. The words must start with a letter. The text file is passed
as a command-line argument.
*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20_1 {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        List<String> words = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNext()) {
                String current = fileScanner.nextLine().toLowerCase();
                String[] tokens = current.split("[\\s+\\p{P}]");
                words.addAll(List.of(tokens));
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        words.sort(null);
        for (String word: words)
            System.out.println(word);
    }
}
