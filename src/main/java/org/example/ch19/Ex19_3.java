package org.example.ch19;

/*
(Distinct elements in ArrayList) Write the following method that returns a new
ArrayList. The new list contains the nonduplicate elements from the original list.

public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
*/

import java.util.ArrayList;

public class Ex19_3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("One");
        input.add("Two");
        input.add("Two");
        input.add("Three");

        System.out.println(removeDuplicates(input));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        for (E item : list) {
            if (!result.contains(item))
                result.add(item);
        }

        return result;
    }
}
