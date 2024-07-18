package org.example.ch20;

import java.util.PriorityQueue;

public class Ex20_12 {
    public static void main(String[] args) {
        
    }
}

class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> queue = new MyPriorityQueue<>();

        for (E e: this)
            queue.offer(e);

        return queue;
    }
}
