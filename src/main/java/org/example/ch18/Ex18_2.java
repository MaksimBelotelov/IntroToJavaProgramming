package org.example.ch18;

/*
(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint: To compute fib(n) without recursion, you need to obtain fib(n − 2)
and fib(n − 1) first. Let f0 and f1 denote the two previous Fibonacci num-
bers. The current Fibonacci number would then be f0 + f1. The algorithm can
be described as follows:
f0 = 0; // For fib(0)
f1 = 1; // For fib(1)
for (int i = 1; i <= n; i++) {
currentFib = f0 + f1;
f0 = f1;
f1 = currentFib;
}
// After the loop, currentFib is fib(n)
Write a test program that prompts the user to enter an index and displays its
Fibonacci number.
*/

public class Ex18_2 {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static long fib(long index) {
        if (index == 0)
            return 0;
        else {
            long previous = 0;
            long current = 1;
            for (int i = 2; i <= index; i++) {
                long temp = current;
                current = previous + current;
                previous = temp;
            }

            return current;
        }
    }
}
