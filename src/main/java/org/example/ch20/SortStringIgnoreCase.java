package org.example.ch20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringIgnoreCase {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Atlanta", "Savannah", "New York", "Dallas");
        cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        for (String s: cities)
            System.out.print(s + " ");
        



    }
}