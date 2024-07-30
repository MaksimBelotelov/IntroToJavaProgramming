package org.example.ch21;

/*
(Count consonants and vowels) Write a program that prompts the user to enter a
text file name and displays the number of vowels and consonants in the file. Use
a set to store the vowels A, E, I, O, and U.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Ex21_4 {
    public static void main(String[] args) {
        Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U');

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text file name: ");
        String fileName = scanner.nextLine();
        int vowelsCounter = 0;
        int consonantsCounter = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                String currentString = fileScanner.nextLine();
                for (int i = 0; i < currentString.length(); i++) {
                    if (Character.isLetter(currentString.charAt(i))) {
                        if (vowels.contains(Character.toUpperCase(currentString.charAt(i))))
                            vowelsCounter++;
                        else
                            consonantsCounter++;
                    }
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Vovels: " + vowelsCounter);
        System.out.println("Consonants: " + consonantsCounter);
    }
}
