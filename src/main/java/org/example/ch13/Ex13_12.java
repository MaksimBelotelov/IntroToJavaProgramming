package org.example.ch13;

/*
(Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. The method signature is

public static double sumArea(GeometricObject[] a)

Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.
*/

import org.example.ch11.GeometricObject;

public class Ex13_12 {
    public static void main(String[] args) {

        GeometricObject[] array = new GeometricObject[4];

        array[0] = new Circle(2);
        array[1] = new Circle(3);
        array[2] = new Rectangle(2, 3);
        array[3] = new Rectangle(3, 4);

        System.out.printf("Total area is: %.2f", sumArea(array));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (var item : a)
            sum += item.getArea();

        return sum;
    }
}
