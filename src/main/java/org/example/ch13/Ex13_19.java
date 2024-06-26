package org.example.ch13;

/*
(Convert decimals to fractions) Write a program that prompts the user to enter a
decimal number and displays the number in a fraction. (Hint: read the decimal
number as a string, extract the integer part and fractional part from the string, and
use the Rational class in Listing 13.13 to obtain a rational number for the decimal number.)
 */

import java.util.Scanner;

public class Ex13_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimal = scanner.nextLine();
        boolean isNegative = false;

        int dotIndex = decimal.indexOf(',');
        String integerPart = decimal.substring(0, dotIndex);
        if(decimal.charAt(0) == '-') isNegative = true;
        String fractionalPart = decimal.substring(dotIndex + 1);

        long denominator = (long)(Math.pow(10, fractionalPart.length()));
        char c;
        for (int i = 0; i < fractionalPart.length() && ((c = fractionalPart.charAt(i)) == '0'); i++)
            denominator /= 10;

        long numerator = Long.parseLong(integerPart) * denominator + Long.parseLong(fractionalPart);
        if (isNegative) numerator *= -1;

        Rational rational = new Rational(numerator, denominator);
        System.out.println(rational);
    }
}
