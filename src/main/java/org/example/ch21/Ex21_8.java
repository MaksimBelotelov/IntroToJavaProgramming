package org.example.ch21;

/*
(Count the occurrences of words in a text file) Rewrite Listing 21.9 to read
the text from a text file. The text file is passed as a command-line argument.
Words are delimited by whitespace characters, punctuation marks (,;.:?),
quotation marks ('"), and parentheses. Count words in case-insensitive fashion
(e.g., consider Good and good to be the same word). The words must
start with a letter. Display the output in alphabetical order of words, with each
word preceded by its occurrence count.
*/

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex21_8 {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File(args[0]))) {
            Map<String, Integer> map = new TreeMap<>();

            while (fileScanner.hasNext()) {
                String text = fileScanner.nextLine();

                String[] words = text.split("[\\s+\\p{P}]");
                for (int i = 0; i < words.length; i++) {
                    String key = words[i].toLowerCase();
                    if (key.length() > 0) {
                        if (!map.containsKey(key)) {
                            map.put(key, 1);
                        } else {
                            int value = map.get(key);
                            value++;
                            map.put(key, value);
                        }
                    }
                }
            }

            map.forEach((k, v) -> System.out.println(v + ":" + k));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
