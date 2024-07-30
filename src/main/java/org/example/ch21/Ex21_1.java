package org.example.ch21;

/*
Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
{"George", "Katie", "Kevin", "Michelle", "Ryan"} and find their union, difference,
intersection.
 */

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Ex21_1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 =
                new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 =
                new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        LinkedHashSet<String> unionSet = (LinkedHashSet<String>)(set1.clone());
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        LinkedHashSet<String> difference = (LinkedHashSet<String>)(unionSet.clone());
        difference.removeAll(set2);
        System.out.println("Diff: " + difference);

        LinkedHashSet<String> intersection = (LinkedHashSet<String>)(set1.clone());
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}
