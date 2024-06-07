package org.example.ch11;

/*
(Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes then implement MyStack . Write a test program that prompts
the user to enter five strings and displays them in reverse order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five strings: ");
        MyStack stack = new MyStack();
        for(int i = 0; i < 5; i++)
            stack.add(scanner.nextLine());

        System.out.println(stack);

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}

class MyStack extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(size() - 1);
    }

    public Object pop() {
        Object o = this.get(size() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
