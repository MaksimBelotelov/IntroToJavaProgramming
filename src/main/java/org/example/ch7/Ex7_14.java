package org.example.ch7;

/*
(Compute gcd) Write a method that returns the gcd of an unspecified number of
integers. The method header is specified as follows:

public static int gcd(int... numbers)

Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */
public class Ex7_14 {
    public static void main(String[] args) {
        System.out.println(gcd(12, 6, 42, 18));
    }

    public static int gcd(int... numbers) {
        int result = 1;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            min = Integer.min(min, numbers[i]);
        for (int k = 2; k <= min; k++) {
            boolean isGdc = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % k != 0) {
                    isGdc = false;
                    break;
                }
            }
            if (isGdc) result = k;
        }
        return result;
    }
}
