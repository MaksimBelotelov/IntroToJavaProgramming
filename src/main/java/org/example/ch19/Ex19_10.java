package org.example.ch19;

/*
(Largest element in an ArrayList) Write the following method that returns the
largest element in an ArrayList:

public static <E extends Comparable<E>> E max(ArrayList<E> list)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Ex19_10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4));
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);

        for (E item : list)
            if (item.compareTo(max) > 0)
                max = item;

        return max;
    }
}
