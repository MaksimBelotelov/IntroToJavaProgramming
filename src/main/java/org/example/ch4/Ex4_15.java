package org.example.ch4;

/*
    (Phone key pads) The international standard letter/number mapping found on the
    telephone is shown below. Write a program that prompts the user to enter a lowercase or uppercase
    letter and displays its corresponding number. For a nonletter input, display invalid input.
 */

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        char ch = input.charAt(0);
        String[] numbers = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (Character.isLetter(ch) && input.length() == 1) {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i].contains(input.toLowerCase())) {
                    System.out.println("The corresponding number is " + (i + 2));
                    break;
                }
            }
        }
        else
            System.out.println(ch + " is invalid input");
    }
}
