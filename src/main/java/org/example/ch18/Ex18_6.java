package org.example.ch18;

/*
(Sum series) Write a recursive method to compute the following series:

m(i) = 1/2 + 2/3 + ... + i/(i+1)

Write a test program that displays m(i) for i = 1, 2, . . . , 10.
*/

public class Ex18_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d : %.2f\n", i, mi3(i));
        }
    }

    public static double mi3(int i) {
        if (i == 1) return 0.5;
        else return (((double)i / (i + 1)) + mi3(i - 1));
    }
}
