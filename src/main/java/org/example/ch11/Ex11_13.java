package org.example.ch11;

/*
(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:

public static void removeDuplicate(ArrayList<Integer> list)

Write a test program that prompts the user to enter 10 integers to a list and
displays the distinct integers in their input order and separated by exactly one space.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++)
            list.add(scanner.nextInt());

        removeDuplicate(list);

        for (Integer item : list)
            System.out.print(item + " ");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        int removedCounter = 0;
        for (int i = 0; i < list.size() - removedCounter - 1; i++) {
            for (int j = i + 1; j < list.size() - removedCounter; j++) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
