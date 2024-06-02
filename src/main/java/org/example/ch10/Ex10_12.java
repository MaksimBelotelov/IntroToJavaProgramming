package org.example.ch10;

/*
(Geometry: the Triangle2D class) Define the Triangle2D class that contains:
■■ Three points named p1 , p2, and p3 of the type MyPoint with getter and
setter methods. MyPoint is defined in Programming Exercise 10.4.
■■ A no-arg constructor that creates a default triangle with the points ( 0, 0),
(1, 1), and (2, 5).
■■ A constructor that creates a triangle with the specified points.
■■ A method getArea() that returns the area of the triangle.
■■ A method getPerimeter() that returns the perimeter of the triangle.
■■ A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle (see Figure 10.22a).
■■ A method contains(Triangle2D t) that returns true if the s pecified
triangle is inside this triangle (see Figure 10.22b).
■■ A method overlaps(Triangle2D t) that returns true if the specified
triangle overlaps with this triangle (see Figure 10.22c).
 */

public class Ex10_12 {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(1.0,2.0);
        MyPoint B = new MyPoint(4.0, 5.0);
        MyPoint C = new MyPoint(6.0, 1.0);

        Triangle2D tr1 = new Triangle2D(A, B, C);

        MyPoint D = new MyPoint(2.0,2.0);
        MyPoint E = new MyPoint(3.4,4.0);
        MyPoint F = new MyPoint(6.0,3.0);

        Triangle2D tr2 = new Triangle2D(D, E, F);

        System.out.printf("Triangle1 ((%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f))\n", tr1.getP1().getX(),
                tr1.getP1().getY(), tr1.getP2().getX(), tr1.getP2().getY(), tr1.getP3().getX(), tr1.getP3().getY());
        System.out.printf("Triangle2 ((%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f))\n", tr2.getP1().getX(),
                tr2.getP1().getY(), tr2.getP2().getX(), tr2.getP2().getY(), tr2.getP3().getX(), tr2.getP3().getY());

        System.out.println("Triangle1 area = " + tr1.getArea());
        System.out.println("Triangle2 area = " + tr2.getArea());

        System.out.println("Triangle2 perimeter = " + tr2.getPerimeter());

        System.out.println("tr1 contains (4,3) : " + tr1.contains(new MyPoint(4, 3)));
        System.out.println("tr1 contains (1,1) : " + tr1.contains(new MyPoint(1, 1)));

        System.out.println("tr1 contains tr2 : " + tr1.contains(tr2));
        System.out.println("tr1 overlaps tr2 : " + tr1.overlaps(tr2));
    }
}

class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1),
                new MyPoint(2, 5));
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getArea() {
        double side1 = distance(p1, p2);
        double side2 = distance(p2, p3);
        double side3 = distance(p3, p1);
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    }

    public boolean contains(MyPoint p) {
        Triangle2D tr1 = new Triangle2D(p1, p, p2);
        Triangle2D tr2 = new Triangle2D(p2, p, p3);
        Triangle2D tr3 = new Triangle2D(p1, p, p3);

        double sumArea = tr1.getArea() + tr2.getArea() + tr3.getArea();

        return Math.abs(sumArea - getArea()) < 0.0001;
    }

    public boolean contains(Triangle2D triangle) {
        return this.contains(triangle.getP1()) && this.contains(triangle.getP2()) &&
                this.contains(triangle.getP3());
    }

    public boolean overlaps(Triangle2D triangle) {
        if (getIntersectingPoint(p1, p2, triangle.getP1(), triangle.getP2()) != null ||
                getIntersectingPoint(p1, p2, triangle.getP2(), triangle.getP3()) != null ||
                getIntersectingPoint(p1, p2, triangle.getP3(), triangle.getP1()) != null ||
                getIntersectingPoint(p2, p3, triangle.getP1(), triangle.getP2()) != null ||
                getIntersectingPoint(p2, p3, triangle.getP2(), triangle.getP3()) != null ||
                getIntersectingPoint(p2, p3, triangle.getP3(), triangle.getP1()) != null ||
                getIntersectingPoint(p3, p1, triangle.getP1(), triangle.getP2()) != null ||
                getIntersectingPoint(p3, p1, triangle.getP2(), triangle.getP3()) != null ||
                getIntersectingPoint(p3, p1, triangle.getP3(), triangle.getP1()) != null) {
            return true;
        }
        return false;
    }

    public static MyPoint getIntersectingPoint(MyPoint p1, MyPoint p2,
                                        MyPoint p3, MyPoint p4) {
        double a = p1.getY() - p2.getY();
        double b = p1.getX() - p2.getX();
        double c = p3.getY() - p4.getY();
        double d = p3.getX() - p4.getX();
        double e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p2.getX()) * p1.getY();
        double f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();

        if (a * d - b * c == 0)  {
            System.out.println("Lines are parallel");
            return null;
        }

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (-1) * (a * f - e * c) / (a * d - b * c);


        if (x >= Math.min(p1.getX(), p2.getX()) && x <= Math.max(p1.getX(), p2.getX()) &&
                y >= Math.min(p1.getY(), p2.getY()) && y <= Math.max(p1.getY(), p2.getY()) &&
                x >= Math.min(p3.getX(), p4.getX()) && x <= Math.max(p3.getX(), p4.getX()) &&
                y >= Math.min(p3.getY(), p4.getY()) && y <= Math.max(p3.getY(), p4.getY())) {
            return new MyPoint(x, y);
        }
        else {
            return null;
        }
    }

    public static double distance(
            MyPoint p1, MyPoint p2) {
        return Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) +
                (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }
}