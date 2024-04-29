package org.example.ch5;

/*
(Compute e) You can approximate e using the following summation:
e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 */

public class Ex5_26 {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;
        for (int i = 1; i <= 20; i++) {
            item /= i;
            e += item;
            System.out.println("For i = " + i
                + " e = " + e);
        }
    }
}
