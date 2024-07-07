package org.example.ch18;

/*
(Sum series) Write a recursive method to compute the following series:

m(i) = 1/3 + 2/5 + 3/7 + 4/9 + 5/11 + ... + i/(2i + 1)

Write a test program that displays m(i) for i = 1, 2, . . . , 10.
 */

public class Ex18_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d : %.2f\n", i, mi2(i));
    }

    public static double mi2(int i) {
        if (i == 1) return 1.0 / 3;
        else return ((i / (2.0 * i + 1)) + mi2(i - 1));
    }
}
