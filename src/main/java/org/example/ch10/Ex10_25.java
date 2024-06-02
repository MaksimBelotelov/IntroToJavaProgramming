package org.example.ch10;

import java.util.Arrays;

/*

(New string split method) The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.

public static String[] split(String s, String regex)

 */
public class Ex10_25 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(split("ab#12#453", "#")));
    }

    public static String[] split(String s, String regex) {
        String[] temp = new String[16];
        StringBuilder sb = new StringBuilder();
        boolean isDelimiterNow = true;
        if (regex.indexOf(s.charAt(0)) == -1)
            isDelimiterNow = false;

        int tokensCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (regex.indexOf(current) == -1) {
                if (isDelimiterNow) {
                    temp[tokensCounter++] = sb.toString();
                    sb = new StringBuilder();
                    isDelimiterNow = false;
                    sb.append(current);
                } else {
                    sb.append(current);
                }
            } else {
                if (isDelimiterNow) {
                    sb.append(current);
                } else {
                    temp[tokensCounter++] = sb.toString();
                    sb = new StringBuilder();
                    isDelimiterNow = true;
                    sb.append(current);
                }
            }
        }
        if (!sb.isEmpty()) temp[tokensCounter++] = sb.toString();
        String[] result = new String[tokensCounter];
        System.arraycopy(temp, 0, result, 0, tokensCounter);
        return result;
    }
}