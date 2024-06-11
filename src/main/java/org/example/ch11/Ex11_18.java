package org.example.ch11;

/*
(ArrayList of Character) Write a method that returns an array list of Character
from a string using the following header:

public static ArrayList<Character> toCharacterArray(String s)

For example, toCharacterArray("abc") returns an array list that contains
characters 'a', 'b', and 'c'.
 */

import java.util.ArrayList;

public class Ex11_18 {
    public static void main(String[] args) {
        String testString = "ABCabcdefg";
        System.out.println(toCharacterArray(testString));
    }

    public static ArrayList<Character> toCharacterArray(String s) {

        ArrayList<Character> result = new ArrayList<>(s.length());

        for (int i = 0; i < s.length(); i++)
            result.add(s.charAt(i));

        return result;
    }
}
