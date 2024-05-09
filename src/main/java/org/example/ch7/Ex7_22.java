package org.example.ch7;
/*
(Find the number of uppercase letters in a string) Write a program that passes a string
to the command line and displays the number of uppercase letters in the string.
 */
public class Ex7_22 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i < args[0].length(); i++) {
            if (Character.isUpperCase(args[0].charAt(i)))
                counter++;
        }
        System.out.println(counter);
    }
}
