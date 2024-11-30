package org.example.ch12;

/*
(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
throw IllegalArgumentException if the loan amount, interest rate, or
number of years is less than or equal to zero.
*/

public class Ex12_4 {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(-1.1, 1, 100.0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

