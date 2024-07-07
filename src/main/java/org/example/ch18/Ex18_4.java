package org.example.ch18;

/*
(Sum series) Write a recursive method to compute the following series:

m(i) = 1 + 1/2 + 1/3 + ... + 1/i

Write a test program that displays m(i) for i = 1, 2, . . . , 10.
*/

public class Ex18_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d : %.2f\n", i, mi(i));
        }
    }

    public static double mi(int i) {
        if (i == 1) return 1;
        else return ((1.0 / i) + mi(i - 1));
    }
}
