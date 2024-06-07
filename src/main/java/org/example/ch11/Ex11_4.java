package org.example.ch11;

/*
(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0 and invokes this method to return the largest number in the input.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Ex11_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 1));
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) return null;
        int max = list.get(0);

        for (Integer item: list)
            if (item > max)
                max = item;

        return max;
    }
}
