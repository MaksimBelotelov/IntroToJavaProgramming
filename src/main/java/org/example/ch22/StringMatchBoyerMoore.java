package org.example.ch22;

import java.util.Scanner;

public class StringMatchBoyerMoore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string text: ");
        String text = input.nextLine();
        System.out.print("Enter a string pattern: ");
        String pattern = input.nextLine();

        int index = match(text, pattern);
        if (index >= 0)
            System.out.println("matched at index " + index);
        else
            System.out.println("unmatched");
    }

    public static int match(String text, String pattern) {
        int i = pattern.length() - 1;
        while (i < text.length()) {
            int k = i;
            int j = pattern.length() - 1;
            while(j >= 0) {
                if (text.charAt(k) == pattern.charAt(j)) {
                    k--;
                    j--;
                }
                else
                    break;
            }

            if (j < 0)
                return i - pattern.length() + 1;

            int u = findLastIndex(text.charAt(k), j - 1, pattern);
            if (u >= 0)
                i = k + pattern.length() - 1 - u;
            else
                i = k + pattern.length();
        }

        return -1;
    }

    private static int findLastIndex(char ch, int j, String pattern) {
        for (int k = j; k >= 0; k--)
            if (ch == pattern.charAt(k))
                return k;

        return -1;
    }
}