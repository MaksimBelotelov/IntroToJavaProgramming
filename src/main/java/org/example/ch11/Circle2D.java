package org.example.ch11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return distance(this.x, this.y, x, y) < radius;
    }

    public boolean contains(Circle2D circle) {
        return ((distance(this.x, this.y, circle.getX(), circle.getY()) <= this.radius - circle.getRadius()) &&
                circle.getRadius() < this.getRadius());

    }

    public boolean overlaps(Circle2D circle) {
        double dst = distance(this.x, this.y, circle.getX(), circle.getY());
        return (dst <= this.radius + circle.getRadius() &&
                dst > this.radius - circle.getRadius());
    }

    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
