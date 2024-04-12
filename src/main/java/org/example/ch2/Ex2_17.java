package org.example.ch2;

/*
    (Science: wind-chill temperature) How cold is it outside? The temperature alone is
    not enough to provide the answer. Other factors including wind speed, relative hu-
    midity, and sunshine play important roles in determining coldness outside. In 2001,
    the National Weather Service (NWS) implemented the new wind-chill temperature
    to measure the coldness using temperature and wind speed.
 */

import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = scanner.nextDouble();

    }
}
