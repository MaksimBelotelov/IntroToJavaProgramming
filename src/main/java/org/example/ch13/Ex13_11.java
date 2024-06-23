package org.example.ch13;

/*
(The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume all eight sides of the octagon are of equal length. The area can be
computed using the following formula:

area = (2 + 4/(2^1/2)) * side * side

The Octagon class has a private double data field named side with its getter and
setter methods. The class has a no-arg constructor that creates an Octagon with
side 0, and a constructor to create an Octagon with a specified side.

Draw the UML diagram that involves Octagon , GeometricObject, Comparable,
and Cloneable. Write a test program that creates an Octagon object with side
value 5 and displays its area and perimeter. Create a new object using the clone
method, and compare the two objects using the compareTo method.
*/

public class Ex13_11 {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        System.out.printf("Area: %.2f\n",octagon1.getArea());
        System.out.println("Perimeter: " + octagon1.getPerimeter());

        Octagon octagon2 = (Octagon)(octagon1.clone());
        System.out.println("compareTo result: " + octagon1.compareTo(octagon2));
    }
}

class Octagon extends GeometricObjectOriginal
        implements Comparable<Octagon>, Cloneable {

    private double side = 0;

    public Octagon() {}

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2 + 4/(Math.pow(2, 0.5))) * side * side;
    }

    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.side, o.getSide());
    }

    @Override
    public Object clone() {
        try {
            return (Octagon)(super.clone());
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}