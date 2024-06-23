package org.example.ch13;

/*
(The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must imple-
ment the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides. The Square class contains a
data field side with getter and setter methods, and a constructor for constructing
a Square with a specified side. The Square class has a private double data field
named side with its getter and setter methods. It has a no-arg constructor to
create a Square with side 0, and another constructor that creates a Square with
the specified side.
Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each object
in the array, display its area and invoke its howToColor method if it is colorable.
 */


import org.example.ch11.GeometricObject;

public class Ex13_7 {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Circle(3);
        arr[1] = new Rectangle(2, 1);
        arr[2] = new Triangle();
        arr[3] = new Triangle(2, 3, 2);
        arr[4] = new Square(4);

        for (GeometricObject item : arr) {
            System.out.println("Area: " + item.getArea());
            if (item instanceof Colorable)
                ((Colorable) item).howToColor();
            else
                System.out.println("Not colorable");
            System.out.println("----------------");
        }
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side = 0;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}