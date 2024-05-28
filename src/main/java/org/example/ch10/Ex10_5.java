package org.example.ch10;

import java.util.Scanner;

/*
(Display the prime factors) Write a program that prompts the user to enter a
positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int n = scanner.nextInt();
        Stack stack = new Stack();
        int factor = 2;
        while (factor <= n) {
            if (n % factor == 0) {
                stack.push(factor);
                n /= factor;
            }
            else
                factor++;
        }

        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}

class Stack {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}