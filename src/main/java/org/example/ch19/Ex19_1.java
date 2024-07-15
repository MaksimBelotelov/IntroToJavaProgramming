package org.example.ch19;

/*
(Revising Listing19.1) Revise the GenericStack class in Listing 19.1 to imple-
ment it using an array rather than an ArrayList. You should check the array size
before adding a new element to the stack. If the array is full, create a new array that
doubles the current array size and copy the elements from the current array to the
new array.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Ex19_1 {
    public static void main(String[] args) {
        GenericStack19_1<Integer> stack = new GenericStack19_1<>();
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.getSize());
        System.out.println(stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.getSize());
        System.out.println(stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
    }
}

class GenericStack19_1<E> {
    public static final int DEFAULT_CAPACITY = 3;
    private Object[] elements;
    private int size;

    public GenericStack19_1() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size > 0)
            return (E)(elements[size - 1]);

        return null;
    }

    public void push(E o) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        elements[size++] = o;
    }

    public E pop() {
        if (size > 0)
            return (E)(elements[--size]);

        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(2 * size);
        for (int i = 0; i < size; i++) {
            res.append(elements[i]);
            res.append(" ");
        }

        return "stack: " + res.toString();
    }
}
