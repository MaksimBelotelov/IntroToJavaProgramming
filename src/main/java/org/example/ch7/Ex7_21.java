package org.example.ch7;

/*
(Sum integers) Write a program that passes an unspecified number of integers from
command line and displays their total.
 */

public class Ex7_21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);

        System.out.println("Total:" + sum);
    }
}
