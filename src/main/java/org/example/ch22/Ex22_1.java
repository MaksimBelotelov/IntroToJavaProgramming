package org.example.ch22;

/*
(Maximum consecutive increasingly ordered substring) Write a program that
prompts the user to enter a string and displays the maximum consecutive
increasingly ordered substring. Analyze the time complexity of your program.
 */

import java.util.*;

public class Ex22_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString = scanner.nextLine();

        TreeSet<String> substrings = new TreeSet<>(Comparator.comparingInt(String::length));
        StringBuilder current = new StringBuilder();
        Character previousChar = null;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (!current.isEmpty() && previousChar >= ch) {
                substrings.add(current.toString());
                current = new StringBuilder();
            }
            current.append(ch);
            previousChar = ch;
        }
        substrings.add(current.toString());

        System.out.println(substrings.last());
    }
}
