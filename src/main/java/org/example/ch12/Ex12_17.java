package org.example.ch12;

/*

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_17 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner wordsScanner = new Scanner(new File("hangman.txt"))) {
            while (wordsScanner.hasNext())
                words.add(wordsScanner.next());
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error! Words bank file not found");
            System.exit(1);
        }


        String[] wordsBank = words.toArray(new String[words.size()]);

        Scanner scanner = new Scanner(System.in);
        do {
            int wordNumber = (int)(Math.random() * wordsBank.length);
            String word = wordsBank[wordNumber];
            char[] letters = new char[word.length()];
            for (int i = 0; i < word.length(); i++)
                letters[i] = '*';
            int missesCounter = 0;

            while (true) {
                System.out.print("(Guess) Enter a letter in word " + String.valueOf(letters) + " >");
                boolean correct = false;
                char guessLetter = scanner.nextLine().charAt(0);
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guessLetter) {
                        correct = true;
                        if (letters[i] != guessLetter) {
                            letters[i] = guessLetter;
                        }
                        else
                            System.out.println(guessLetter + " is already in the word");
                    }
                }
                if (!correct) {
                    System.out.println(guessLetter + " is not in the word");
                    missesCounter++;
                }
                if(word.equals(String.valueOf(letters))) {
                    System.out.printf("The word is %s. You missed %d times\n", word, missesCounter);
                    System.out.print("Do you want to guess another word? Enter y or n>");
                    break;
                }
            }
        }
        while (scanner.nextLine().equals("y"));
    }
}
