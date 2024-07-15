package org.example.ch19;

/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList:

public static <E> void shuffle(ArrayList<E> list)
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Ex19_8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        shuffle(list);
        System.out.println(list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());
            E temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }
}
