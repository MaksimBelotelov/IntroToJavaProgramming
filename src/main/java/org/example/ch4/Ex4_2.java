package org.example.ch4;

/*
    (Geometry: great circle distance) The great circle distance is the distance be-
    tween two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
    geographical latitude and longitude of two points. The great circle distance be-
    tween the two points can be computed using the following formula:
    d = radius * arccos(sin (x1) * sin(x2) + cos(x 1) * cos(x2) * cos(y 1 - y2))
    Write a program that prompts the user to enter the latitude and longitude of two
    points on the earth in degrees and displays its great circle distance. The average
    radius of the earth is 6,371.01 km. Note you need to convert the degrees into
    radians using the Math.toRadians method since the Java trigonometric meth-
    ods use radians. The latitude and longitude degrees in the formula are for north
    and west. Use negative to indicate south and east degrees.
 */

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        final double radius = 6371.01;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double d = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
