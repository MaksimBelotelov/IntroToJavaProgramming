package org.example.ch5;

/*
    (Compute p) You can approximate p by using the following summation:
    pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^(i+1)/2i - 1)
    Write a program that displays the pi value for i = 10000, 20000 and 100000
 */

public class Ex5_25 {
    public static void main(String[] args) {
        double sum = 0;
        for (int n = 10000; n <= 100000; n += 10000) {
            sum = 0;
            for (int i = n; i >= 1; i--) {
                sum += (Math.pow(-1, (i + 1))) / (2 * i - 1);
            }
            double pi = 4 * sum;
            System.out.println("For i = " + n + " pi = " + pi);
        }
    }
}
