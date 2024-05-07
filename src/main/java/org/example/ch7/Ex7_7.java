package org.example.ch7;

/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Ex7_7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int rand = (int)(Math.random() * 10);
            counts[rand]++;
        }
        for (int i = 0; i < 10; i++)
            System.out.printf("%d : %d\n", i, counts[i]);
    }
}
