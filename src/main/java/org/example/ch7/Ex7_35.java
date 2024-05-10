package org.example.ch7;

/*
(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that",...};
 */

import java.util.Scanner;

public class Ex7_35 {
    public static void main(String[] args) {
        String[] wordsBank = {"write", "that", "chocolate"};
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
