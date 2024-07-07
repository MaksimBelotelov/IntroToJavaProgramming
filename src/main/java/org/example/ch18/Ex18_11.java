package org.example.ch18;

/*
(Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:

public static int sumDigits(long n)

For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.
*/

public class Ex18_11 {
    public static void main(String[] args) {
        System.out.println("The sum of digits is: " + sumOfDigits(1234));
    }

    public static int sumOfDigits(long n) {
        if (n == 0)
            return 0;
        else {
            return (int)(n % 10 + sumOfDigits(n / 10));
        }
    }
}
