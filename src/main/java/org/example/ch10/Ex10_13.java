package org.example.ch10;
/*
(Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
contains:
■■ Two double data fields named x and y that specify the center of the rectangle
with getter and setter methods. (Assume the rectangle sides are parallel to
x- or y-axis.)
■■ The data fields width and height with getter and setter methods.
■■ A no-arg constructor that creates a default rectangle with (0 , 0) for (x, y) and
1 for both width and height.
■■ A constructor that creates a rectangle with the specified x, y, width, and
height.
■■ A method getArea() that returns the area of the rectangle.
■■ A method getPerimeter() that returns the perimeter of the rectangle.
■■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this rectangle (see Figure 10.24a).
■■ A method contains(MyRectangle2D r) that returns true if the specified
rectangle is inside this rectangle (see Figure 10.24b).
■■ A method overlaps(MyRectangle2D r) that returns true if the specified
rectangle overlaps with this rectangle (see Figure 10.24c).
 */
public class Ex10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(3.0, 2.0, 6.0, 4.0);
        MyRectangle2D r2 = new MyRectangle2D(5.0, 3.0, 2.0, 2.0);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("r1.contains(3, 3):" + r1.contains(3.0, 3.0));
        System.out.println("r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2):" + r1.contains(r2));
        System.out.println("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))" + r1.overlaps(r2));
    }
}

class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0.0, 0.0, 1.0, 1.0);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        return ((x >= this.x - width / 2) && (x <= this.x + width / 2) &&
                (y >= this.y - height / 2) && (y <= this.y + height / 2));
    }

    public boolean contains(MyRectangle2D r) {
        return (Math.abs(r.getY() - this.y) + r.getHeight() / 2 <= this.height / 2) &&
                (Math.abs(r.getX() - this.x) + r.getWidth() / 2 <= this.width / 2);
    }

    public boolean overlaps(MyRectangle2D r) {
        return (Math.abs(r.getX() - this.x) <= this.width / 2 + r.width / 2) &&
                (Math.abs(r.getY() - this.y) <= this.height / 2 + r.height / 2) &&
                !this.contains(r);
    }
}
