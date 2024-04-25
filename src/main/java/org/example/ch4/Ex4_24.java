package org.example.ch4;

/*
    (Order three cities) Write a program that prompts the user to enter three cities
    and displays them in ascending order.
 */

import java.util.Scanner;

public class Ex4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = scanner.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = scanner.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = scanner.nextLine();

        if (firstCity.compareTo(secondCity) > 0) {
            String sTemp = firstCity;
            firstCity = secondCity;
            secondCity = sTemp;
        }

        if (secondCity.compareTo(thirdCity) > 0) {
            String sTemp = secondCity;
            secondCity = thirdCity;
            thirdCity = sTemp;
        }

        if (firstCity.compareTo(secondCity) > 0) {
            String sTemp = firstCity;
            firstCity = secondCity;
            secondCity = sTemp;
        }


        System.out.println("The three cities in alphabetical order are " +
                firstCity + " " + secondCity + " " + thirdCity);
    }
}
