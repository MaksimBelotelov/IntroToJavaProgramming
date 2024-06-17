package org.example.ch12;

/*
(Data sorted?) Write a program that reads the strings from file SortedStrings.txt
and reports whether the strings in the files are stored in increasing order. If the
strings are not sorted in the file, it displays the first two strings that are out of
the order.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SortedStrings.txt");
        System.out.println(isSortedStrings(file));
    }

    public static boolean isSortedStrings (File file) throws FileNotFoundException {
        try (Scanner fileScanner = new Scanner(file)) {
            String previous = fileScanner.nextLine();
            while (fileScanner.hasNext()) {
                String current = fileScanner.nextLine();
                if (current.compareTo(previous) < 0) {
                    System.out.println(previous);
                    System.out.println(current);
                    return false;
                }
                previous = current;
            }
            return true;
        }
    }
}