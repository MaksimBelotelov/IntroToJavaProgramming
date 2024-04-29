package org.example.ch5;

/*
(Sum a series) Write a program to compute the following summation:
1/3 + 3/5 + 5/7 + 7/9 + ... + 95/97 + 97/99
 */

public class Ex5_24 {
    public static void main(String[] args) {
        double num = 0;
        double sum = 0;

        for(int d = 3; d <= 99; d++) {
            num = (d - 2) / (d * 1.0);
            sum += num;
        }

        System.out.println("Sum is " + sum);
    }
}
