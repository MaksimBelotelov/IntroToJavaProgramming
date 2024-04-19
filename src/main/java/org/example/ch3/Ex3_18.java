package org.example.ch3;

/*
    (Cost of shipping) A shipping company uses the following function to calculate
    the cost (in dollars) of shipping based on the weight of the package (in pounds).
 */

import java.util.Scanner;

public class Ex3_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double w = scanner.nextInt();
        double c = 0;

        if (w > 0 && w <= 20) {
            if (w <= 1) c = 3.5;
            else if (w <= 3) c = 5.5;
            else if (w <= 10) c = 8.5;
            else c = 10.5;
            System.out.printf("Shipping cost: $%.2f", c);
        } else {
            System.out.println("Invalid input. The package cannot be shipped.");
        }
    }
}
