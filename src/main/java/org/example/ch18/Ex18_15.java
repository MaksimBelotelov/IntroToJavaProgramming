package org.example.ch18;

/*
(Occurrences of a specified character in a string) Rewrite Programming
Exercise 18.10 using a helper method to pass the substring high index to the method.
The helper method header is public static int count(String str, char a, int high)
*/

public class Ex18_15 {
    public static void main(String[] args) {
        String input = "abacabb";
        System.out.println(count(input, 'b'));
    }

    public static int count(String str, char a) {
        return count(str, a, str.length() - 1);
    }

    public static int count(String str, char a, int high) {
        if (high == -1)
            return 0;
        else {
            return ((str.charAt(high) == a) ? 1 : 0) +
                    count(str, a, high - 1);
        }
    }
}
