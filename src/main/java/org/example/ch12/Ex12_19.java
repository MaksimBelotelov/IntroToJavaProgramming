package org.example.ch12;

/*
(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from https://liveexample.pearsoncmg
.com/data/Lincoln.txt.
*/

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Ex12_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
            Scanner scanner = new Scanner(url.openStream());
            int counter = 0;
            while (scanner.hasNext()) {
                String current = scanner.nextLine();
                String[] words = current.split(" ");
                counter += words.length;
            }

            System.out.println("Words amount: " + counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
