package org.example.ch13;

/*
(Enable GeometricObject comparable) Modify the GeometricObject class to
implement the Comparable interface and define a static max method in the Geo-
metricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles, the larger
of two rectangles.
 */

import org.example.ch11.GeometricObject;

public class Ex13_5 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(2);
        GeometricObject circle2 = new Circle(3);


        GeometricObject rect1 = new Rectangle(3, 2);
        GeometricObject rect2 = new Rectangle(2, 2);

        System.out.println("Area of max circle is: " +
                GeometricObject.max(circle1, circle2).getArea());
        System.out.println("Area of max rectangle is: " +
                GeometricObject.max(rect1, rect2).getArea());
    }
}
