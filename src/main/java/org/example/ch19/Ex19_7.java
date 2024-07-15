package org.example.ch19;

/*
(Generic linear search) Implement the following generic method for linear search:
public static <E extends Comparable<E>>
int linearSearch(E[] list, E key)
*/

public class Ex19_7 {
    public static void main(String[] args) {
        Integer[] list = {0, 1, 2, 5, 6};
        System.out.println(binarySearch(list, 5));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int left = 0;
        int right = list.length - 1;
        int current;

        while (true) {
            current = (left + right) / 2;
            if (list[current].compareTo(key) == 0) return current;
            else if (left > right) return -1;
            else if (list[current].compareTo(key) > 0) right = current - 1;
            else if (list[current].compareTo(key) < 0) left = current + 1;
        }
    }
}
