package org.example.ch13;

import org.example.ch11.GeometricObject;

public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        super();
        if (isValid(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
            System.out.println("Can't create triangle. Invalid sides");
    }

    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled) {
        this(side1, side2, side3);

        this.setColor(color);
        this.setFilled(filled);
    }

    private static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side3 + side1 > side2);
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
}
