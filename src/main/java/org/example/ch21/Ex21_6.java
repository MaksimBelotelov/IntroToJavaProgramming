package org.example.ch21;

/*
(Count the occurrences of numbers entered) Write a program that reads an
unspecified number of integers and finds the one that has the most occur-
rences. The input ends when the input is 0. For example, if you entered 2
3 40 3 5 4 –3 3 3 2 0, the number 3 occurred most often. If not one but
several numbers have the most occurrences, all of them should be reported.
For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occur-
rences should be reported.
 */

import java.util.*;

public class Ex21_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers(enter 0 to finish): ");
        Map<Integer, Integer> numbers = new HashMap<>();

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            if (numbers.containsKey(n))
                numbers.put(n, numbers.get(n) + 1);
            else
                numbers.put(n, 1);
        }

        Integer max = Collections.max(numbers.values());
        Set<Integer> maxOccurrencesNumbers = new HashSet<>();
        for (var entry : numbers.entrySet()) {
            if (entry.getValue() == max)
                maxOccurrencesNumbers.add(entry.getKey());
        }

        System.out.println("Numbers " + maxOccurrencesNumbers + " has " + max + " occurrences");
    }
}