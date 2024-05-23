package org.example.ch9;

/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test pro-
gram that creates two Rectangle objects—one with width 4 and height 40, and
the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.

 */
public class Ex9_1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rect1 width: " + rectangle1.getWidth());
        System.out.println("Rect1 height: " + rectangle1.getHeight());
        System.out.println("Rect1 area: " + rectangle1.getArea());
        System.out.println("Rect1 perimeter: " + rectangle1.getPerimeter());

        System.out.println("Rect2 width: " + rectangle2.getWidth());
        System.out.println("Rect2 height: " + rectangle2.getHeight());
        System.out.println("Rect2 area: " + rectangle2.getArea());
        System.out.println("Rect2 perimeter: " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return this.height * 2 + this.width * 2;
    }
}
