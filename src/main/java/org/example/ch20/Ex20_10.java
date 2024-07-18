package org.example.ch20;

/*
(Perform set operations on priority queues) Write a program that creates
two priority queues, {"George", "Jim", "John", "Blake", "Kevin",
"Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}
and displays their union, difference, and intersection.
 */

import java.util.List;
import java.util.PriorityQueue;

public class Ex20_10 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>(
                List.of("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> queue2 = new PriorityQueue<>(
                List.of("George", "Katie", "Kevin", "Michelle", "Ryan"));

        System.out.println(queueUnion(queue1, queue2));
        System.out.println(queueIntersection(queue1, queue2));
        System.out.println(queueDifference(queue1, queue2));
    }

    public static <T> PriorityQueue<T> queueUnion(PriorityQueue<T> queue1,
                                              PriorityQueue<T> queue2) {

        PriorityQueue<T> result = new PriorityQueue<>();
        result.addAll(queue1);
        result.addAll(queue2);

        return result;
    }

    public static <T> PriorityQueue <T> queueIntersection(PriorityQueue<T> queue1,
                                                          PriorityQueue<T> queue2) {

        PriorityQueue<T> result = new PriorityQueue<>(queue1);
        result.retainAll(queue2);

        return result;
    }

    public static <T> PriorityQueue <T> queueDifference(PriorityQueue<T> queue1,
                                                        PriorityQueue<T> queue2) {

        PriorityQueue<T> result = new PriorityQueue<>(queue1);
        result.removeAll(queue2);

        return result;
    }
}
