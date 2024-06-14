package org.example.ch12;

/*
(IllegalTriangleException) Programming Exercise 11.1 defined the
Triangle class with three sides. In a triangle, the sum of any two sides is
greater than the other side. The Triangle class must adhere to this rule.
Create the IllegalTriangleException class, and modify the constructor
of the Triangle class to throw an IllegalTriangleException object if a
triangle is created with sides that violate the rule, as follows:
Construct a triangle with the specified sides

public Triangle(double side1, double side2, double side3)
        throws IllegalTriangleException {
    Implement it
}
*/

import org.example.ch11.GeometricObject;

public class Ex12_5 {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1, 1, 1);
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 ||
            side2 + side3 < side1 ||
            side3 + side1 < side2)
            throw new IllegalTriangleException();

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    public void setSide1(double side1) { this.side1 = side1; }
    public void setSide2(double side2) { this.side2 = side2; }
    public void setSide3(double side3) { this.side3 = side3; }

    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}

class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("The sum of any two sides should be greather than the other side");
    }
}