package org.example.ch10;
/*
(Display the prime numbers) Write a program that displays all the prime num-
bers less than 120 in decreasing order. Use the StackOfIntegers class to
store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in
reverse order.
 */
public class Ex10_6 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 2; i < 120; i++) {
            boolean isPrime = true;
            for (int d = 2; d <= i / 2; d++) {
                if (i % d == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                stack.push(i);
        }

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
