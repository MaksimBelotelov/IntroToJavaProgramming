package org.example.ch18;

/*
(Factorial) Using the BigInteger class introduced in Section 10.9, you can
find the factorial for a large number (e.g., 100!). Implement the factorial
method using recursion. Write a program that prompts the user to enter an inte-
ger and displays its factorial.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Ex18_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt();
        BigInteger n = BigInteger.valueOf(number);
        System.out.println(bigFactorial(n));
    }

    public static BigInteger bigFactorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(bigFactorial(n.subtract(BigInteger.ONE)));
    }
}
