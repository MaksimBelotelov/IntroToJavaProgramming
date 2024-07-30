package org.example.ch21;

/*
(Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to
display the words in ascending order of occurrence counts.
 */

import java.util.*;

public class Ex21_7 {
    public static void main(String[] args) {
        // Set text in a string
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split("[\\s+\\p{P}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue));

        for (var entry: entries)
            System.out.println(entry.getKey() + ":" + entry.getValue());
    }
}
