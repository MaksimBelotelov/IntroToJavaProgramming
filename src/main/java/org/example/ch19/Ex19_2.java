package org.example.ch19;

/*
(Implement GenericStack using inheritance) In Listing 19.1, GenericStack is
implemented using composition. Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes then implement GenericStack. Write a test
program that prompts the user to enter five strings and displays them in reverse order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex19_2 {
    public static void main(String[] args) {
        GenericStack19_2<String> stack192 = new GenericStack19_2<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            String current = scanner.nextLine();
            stack192.push(current);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack192.pop());
        }
    }
}

class GenericStack19_2<E> extends ArrayList<E> {

    public int getSize() {
        return size();
    }

    public E peek() {
        return this.get(getSize() - 1);
    }

    public void push(E o) {
        this.add(o);
    }

    public E pop() {
        E o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
