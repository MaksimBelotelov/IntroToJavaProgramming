package org.example.ch10;
/*
(The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
■■ The data fields x and y that represent the coordinates with getter methods.
■■ A no-arg constructor that creates a point (0, 0).
■■ A constructor that constructs a point with specified coordinates.
■■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
■■ A static method named distance that returns the distance from two MyPoint
objects.
Draw the UML diagram for the class then implement the class. Write a test
program that creates the two points (0, 0) and (10, 30.5) and displays the dis-
tance between them.
 */
public class Ex10_4 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(p1.distance(p2));
    }
}

class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }

}
