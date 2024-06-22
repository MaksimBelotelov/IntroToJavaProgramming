package org.example.ch13;

/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList of
numbers:

public static void shuffle(ArrayList<Number> list)

*/

import java.util.ArrayList;

public class Ex13_2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.2);
        list.add(3);
        list.add(4.44);

        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
