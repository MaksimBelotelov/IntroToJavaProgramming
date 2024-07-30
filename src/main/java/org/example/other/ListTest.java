package org.example.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);

        list.add(1, 3);
        System.out.println(list);
    }
}
