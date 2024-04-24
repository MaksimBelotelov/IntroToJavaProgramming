package org.example.ch4;

/*
    (Random character) Write a program that displays a random uppercase letter
    using the Math.random() method.
 */

public class Ex4_16 {
    public static void main(String[] args) {
        int code = 65 + (int)(Math.random() * 26);
        System.out.println((char)(code));
    }
}
