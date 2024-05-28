package org.example.ch9;
/*
(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
the same length and all angles have the same degree (i.e., the polygon is both equi-
lateral and equiangular). Design a class named RegularPolygon that contains:
■■ A private int data field named n that defines the number of sides in the polygon
with default value 3.
■■ A private double data field named side that stores the length of the side with
default value 1.
■■ A private double data field named x that defines the x-coordinate of the poly-
gon’s center with default value 0.
■■ A private double data field named y that defines the y-coordinate of the poly-
gon’s center with default value 0.
■■ A no-arg constructor that creates a regular polygon with default values.
■■ A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
■■ A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
■■ The accessor and mutator methods for all data fields.
■■ The method getPerimeter() that returns the perimeter of the polygon.
■■ The method getArea() that returns the area of the polygon. The formula for
computing the area of a regular polygon is
...
Draw the UML diagram for the class then implement the class. Write a test pro-
gram that creates three RegularPolygon objects, created using the no-arg con-
structor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4,
5.6, 7.8). For each object, display its perimeter and area.
 */
public class Ex9_9 {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon1's perimeter: " + rp1.getPerimeter());
        System.out.println("Polygon1's area: " + rp1.getArea());

        System.out.println("Polygon2's perimeter: " + rp2.getPerimeter());
        System.out.println("Polygon2's area: " + rp2.getArea());

        System.out.println("Polygon3's perimeter: " + rp3.getPerimeter());
        System.out.println("Polygon3's area: " + rp3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {}

    public RegularPolygon(int n, double side) {
        this();
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this(n, side);
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}