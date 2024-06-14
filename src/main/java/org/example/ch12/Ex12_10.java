package org.example.ch12;

/*
(OutOfMemoryError) Write a program that causes the JVM to throw an
OutOfMemoryError and catches and handles this error.
*/

public class Ex12_10 {
    public static void main(String[] args) {
        try {
            long[] wildArray = new long[Integer.MAX_VALUE];
        }
        catch (Error err) {
            System.out.println(err.getMessage());
        }
        System.out.println("After catch statement");
    }
}
