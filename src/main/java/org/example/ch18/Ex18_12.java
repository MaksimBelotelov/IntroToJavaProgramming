package org.example.ch18;

public class Ex18_12 {
    public static void main(String[] args) {
        reverseDisplay("abcd");
    }

    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high) {
        if (high == -1) System.out.print("");
        else {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}
