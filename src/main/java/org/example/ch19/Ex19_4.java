package org.example.ch19;

/*
(Generic linear search) Implement the following generic method for linear search:

public static <E extends Comparable<E>>
int linearSearch(E[] list, E key)
*/

public class Ex19_4 {
    public static void main(String[] args) {
        Integer[] input = {1, 3, 2, 4, 0};
        System.out.println(linearSearch(input, 4));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++)
            if (list[i].compareTo(key) == 0)
                return i;

        return -1;
    }
}
