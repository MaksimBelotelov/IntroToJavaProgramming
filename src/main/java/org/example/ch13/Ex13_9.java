package org.example.ch13;

/*
(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.
*/

public class Ex13_9 {
    public static void main(String[] args) {
        Circle13_9 circle1 = new Circle13_9(2);
        Circle13_9 circle2 = new Circle13_9(2);

        Circle13_9 circle3 = new Circle13_9(1);

        System.out.println("circle1 equals circle2: " + circle1.equals(circle2));
        System.out.println("circle1 equals circle1: " + circle1.equals(circle1));
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3));
    }
}

class Circle13_9 extends GeometricObjectOriginal implements Comparable<Circle13_9> {
    private double radius;

    public Circle13_9() {}

    public Circle13_9(double radius) {
        this.radius = radius;
    }

    public Circle13_9(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(Circle13_9 c) {
        return Double.compare(this.radius, c.getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle13_9)
            return this.compareTo((Circle13_9)o) == 0;
        return false;
    }
}