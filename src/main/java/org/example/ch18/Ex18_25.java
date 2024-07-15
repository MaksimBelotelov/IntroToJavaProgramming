package org.example.ch18;

/*
(String permutation) Write a recursive method to print all the permutations of a
string. For example, for the string abc, the permutation is
abc
acb
bac
bca
cab
cba
*/

public class Ex18_25 {
    public static void main(String[] args) {
        String input = "abc";
        displayPermutation(input);
    }

    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.isBlank())
            System.out.println(s1);
        else
            for (int i = 0; i < s2.length(); i++)
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
    }
}
