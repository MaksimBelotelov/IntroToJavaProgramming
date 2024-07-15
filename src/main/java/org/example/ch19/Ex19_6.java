package org.example.ch19;

/*
(Maximum element in a two-dimensional array) Write a generic method that returns
the maximum element in a two-dimensional array.

public static <E extends Comparable<E>> E max(E[][] list)
*/

public class Ex19_6 {
    public static void main(String[] args) {
        Integer[][] integers = {{1, 2, 3}, {7, 9, 8}, {4, 5, 6}};
        System.out.println(max(integers));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j].compareTo(max) > 0)
                    max = list[i][j];
            }
        }

        return max;
    }
}
