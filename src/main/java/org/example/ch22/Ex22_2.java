package org.example.ch22;

/*
(Maximum increasingly ordered subsequence) Write a program that prompts
the user to enter a string and displays the maximum increasingly ordered subsequence
of characters. Analyze the time complexity of your program.
*/

import java.util.Scanner;

public class Ex22_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = scanner.nextLine();
        System.out.println(maxIncSubsequence(input));
    }

    public static String maxIncSubsequence(String str) {
        int[] maxLen = new int[str.length()];
        int[] prevIndex = new int[str.length()];
        int maxLength = 0;
        int lastItemIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            prevIndex[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (str.charAt(j) < str.charAt(i) && maxLen[i] < maxLen[j] + 1) {
                    maxLen[i] = maxLen[j] + 1;
                    prevIndex[i] = j;
                    if (maxLen[i] > maxLength) {
                        maxLength = maxLen[i];
                        lastItemIndex = i;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int currentIndex = lastItemIndex;

        for (int i = 0; i <= maxLength; i++) {
            sb.append(str.charAt(currentIndex));
            currentIndex = prevIndex[currentIndex];
        }
        return sb.reverse().toString();
    }
}
