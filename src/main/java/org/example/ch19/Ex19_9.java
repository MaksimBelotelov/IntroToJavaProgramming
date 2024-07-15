package org.example.ch19;

/*
(Sort ArrayList) Write the following method that sorts an ArrayList:
public static <E extends Comparable<E>>

void sort(ArrayList<E> list)

Write a test program that prompts the user to enter 10 integers, invokes this method
to sort the numbers, and displays the numbers in increasing order.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Ex19_9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 1, 3, 5));
        sort(list);
        System.out.println(list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        list.sort(null);
    }
}