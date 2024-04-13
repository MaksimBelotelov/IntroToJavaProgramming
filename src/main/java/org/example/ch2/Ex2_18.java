package org.example.ch2;

/*
    (Print a table) Write a program that displays the following table. Cast
    floating-point numbers into integers.
 */

public class Ex2_18 {
    public static void main(String[] args) {
        System.out.println("a   b   pow(a,b)");
        for (int a = 1, b = 2; a < 6; a++, b++)
            System.out.println(a + "    " + b + "   " + (int)(Math.pow(a, b)));
    }
}
