package org.example.ch20;

/*
(Use iterators on linked lists) Write a test program that stores 5 million integers
in a linked list and test the time to traverse the list using an iterator vs. using
the get(index) method.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex20_6 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++)
            list.add(i);

        Iterator<Integer> iterator = list.iterator();
        long start = System.currentTimeMillis();
        int n = 0;
        while (iterator.hasNext())
            n = iterator.next();
        long finish = System.currentTimeMillis();
        System.out.println("Time of traverse by iterator: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++)
            n = list.get(i);
        finish = System.currentTimeMillis();
        System.out.println("Time of traverse by index: " + (finish - start));
    }
}
