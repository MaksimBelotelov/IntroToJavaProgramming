package org.example.ch8;

import java.util.Scanner;

/*
(Central city) Given a set of cities, the central city is the city that has the shortest
total distance to all other cities. Write a program that prompts the user to enter
the number of cities and the locations of the cities (coordinates), and finds the
central city and its total distance to all other cities.
 */
public class Ex8_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = scanner.nextInt();
        double[][] cities = new double[numberOfCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++) {
            cities[i][0] = scanner.nextDouble();
            cities[i][1] = scanner.nextDouble();
        }

        int minIndex = 0;
        double minTotal = Double.MAX_VALUE;
        for (int i = 0; i < cities.length; i++) {
            double total = 0;
            for (int j = 0; j < cities.length; j++) {
                total += Math.sqrt(Math.pow((cities[j][0] - cities[i][0]), 2) +
                        Math.pow((cities[j][1] - cities[i][1]), 2));
            }
            if (total < minTotal) {
                minTotal = total;
                minIndex = i;
            }
        }
        System.out.printf("The central city is at (%.1f, %.1f)\n", cities[minIndex][0], cities[minIndex][1]);
        System.out.printf("The total distance to all cities is %.2f\n", minTotal);
    }
}
