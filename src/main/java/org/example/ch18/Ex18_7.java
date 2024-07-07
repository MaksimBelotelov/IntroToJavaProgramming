package org.example.ch18;

/*
(Fibonacci series) Modify Listing 18.2, ComputeFibonacci.java, so that the
program finds the number of times the fib method is called. (Hint: Use a static
variable and increment it every time the method is called.)
*/

import java.util.Scanner;

public class Ex18_7 {
    static int counter = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index "
                + index + " is " + fib(index));
        System.out.println("Method fib() called " + counter + " times");
    }

    public static long fib(long index) {
        counter++;
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}
