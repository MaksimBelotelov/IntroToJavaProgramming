package org.example.ch5;
/*
    (Financial application: compute future tuition) Suppose the tuition for a univer-
    sity is $10,000 this year and increases 5% every year. In one year, the tuition will
    be $10,500. Write a program that displays the tuition in 10 years, and the total
    cost of four years’ worth of tuition starting after the tenth year.
 */
public class Ex5_7 {
    public static void main(String[] args) {
        double currentTuition = 10000;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Year: %d  Tuition: $%.2f\n", i, currentTuition);
            currentTuition *= 1.05;
        }

        double total = 0;
        System.out.println("\nAfter 10 years:");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Year: %d  Tuition: $%.2f\n", i, currentTuition);
            total += currentTuition;
            currentTuition *= 1.05;
        }

        System.out.printf("Total cost of four years: $%.2f\n", total);
    }
}
