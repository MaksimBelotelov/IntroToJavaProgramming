package org.example.ch13;

/*
(Create a rational-number calculator) Write a program similar to Listing 7.9,
Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10.
You will need to use the split method in the String class, introduced in
Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string
and denominator string, and convert strings into integers using the Integer.parseInt method.
 */

import java.util.Scanner;

public class Ex13_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex13_16 \"3/4 + 1/5\"");
            System.exit(1);
        }
        
        String[] tokens = args[0].split("\\s+");
        String[] num1 = tokens[0].split("/");
        String[] num2 = tokens[2].split("/");

        Rational rational1 = new Rational(Long.parseLong(num1[0]), Long.parseLong(num1[1]));
        Rational rational2 = new Rational(Long.parseLong(num2[0]), Long.parseLong(num2[1]));

        switch (tokens[1]) {
            case "+":
                System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
                break;
            case "-":
                System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
                break;
            case "*":
                System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
                break;
            case "/":
                System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
                break;
            default:
                System.out.println("No such operation " + tokens[1]);
        }
    }
}