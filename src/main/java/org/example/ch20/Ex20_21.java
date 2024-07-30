package org.example.ch20;

/*
(Use Comparator) Write the following generic method using selection sort
and a comparator:

public static <E> void selectionSort(E[] list,
Comparator<? super E> comparator)

Write a test program that prompts the user to enter six strings, invokes the sort
method to sort the six strings by their last character, and displays the sorted strings.
Use Scanner’s next() method to read a string.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.String;

public class Ex20_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];

        System.out.print("Enter six strings: ");
        for (int i = 0; i < 6; i++)
            strings[i] = scanner.next();

        selectionSort(strings, new StringComparator());

        System.out.println(Arrays.toString(strings));
    }


    public static <E> void selectionSort(E[] list,
                                         Comparator<? super E> comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            E min = list[i];
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(list[j], list[i]) < 0) {
                    min = list[j];
                    indexMin = j;
                }
            }
            list[indexMin] = list[i];
            list[i] = min;
        }
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Character.compare(o1.charAt(o1.length() - 1),
                o2.charAt(o2.length() - 1));
    }
}