package org.example.ch11;

import java.util.ArrayList;
import java.util.Arrays;

/*
(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers:

public static void shuffle(ArrayList<Integer> list)
 */
public class Ex11_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());
            int temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }
}
