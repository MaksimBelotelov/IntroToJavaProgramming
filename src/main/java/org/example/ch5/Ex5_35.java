package org.example.ch5;
/*
(Summation) Write a program to compute the following summation:
 */
public class Ex5_35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 625; i > 1; i--)
            sum += 1 / (Math.pow(i, 0.5) + Math.pow(i - 1, 0.5));
        System.out.println(sum);
    }
}
