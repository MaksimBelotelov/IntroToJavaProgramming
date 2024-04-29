package org.example.ch5;

/*
(Find the smallest n such that n2 > 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000.
 */

public class Ex5_12 {
    public static void main(String[] args) {
        int i = 1;
        while (Math.pow(i, 2) < 12000)
            i++;

        System.out.println("Number: " + i);
    }
}
