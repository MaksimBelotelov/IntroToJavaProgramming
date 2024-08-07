package org.example.ch18;

/*
(Compute greatest common divisor using recursion) The gcd(m, n) can also
be defined recursively as follows:
■■ If m % n is 0, gcd(m, n) is n.
■■ Otherwise, gcd(m, n) is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the
user to enter two integers and displays their GCD.
*/

import java.util.Scanner;

public class Ex18_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("GCD: " + gcd(n1, n2));
    }

    public static int gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}
