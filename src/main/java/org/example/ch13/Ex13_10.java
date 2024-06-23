package org.example.ch13;

/*
(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal if
their areas are the same. Draw the UML diagram that involves Rectangle, Geo-
metricObject, and Comparable.
*/

public class Ex13_10 {
    public static void main(String[] args) {
        Rectangle13_10 rect1 = new Rectangle13_10(2, 3);
        Rectangle13_10 rect2 = new Rectangle13_10(3, 2);

        System.out.println(rect1.compareTo(rect2));
        System.out.println(rect1.equals(rect2));
    }
}

class Rectangle13_10 extends GeometricObjectOriginal implements Comparable<Rectangle13_10> {
    private double width;
    private double height;

    public Rectangle13_10() {
    }

    public Rectangle13_10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle13_10 rect) {
        return Double.compare(this.getArea(), rect.getArea());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle13_10)
            return (this.compareTo((Rectangle13_10)o) == 0);
        return false;
    }
}