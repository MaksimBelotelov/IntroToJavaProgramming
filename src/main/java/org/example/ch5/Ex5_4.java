package org.example.ch5;

/*
    (Conversion from miles to kilometers) Write a program that displays the follow-
    ing table (note 1 mile is 1.609 kilometers):
 */

public class Ex5_4 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-5s", "Miles", "Kilometers\n");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%-12d%-6.3f\n", i, i * 1.609);
    }
}
