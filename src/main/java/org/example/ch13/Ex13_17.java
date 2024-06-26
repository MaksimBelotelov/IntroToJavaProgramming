package org.example.ch13;

/*
(Math: The Complex class) A complex number is a number in the form a + bi,
where as the real a and part b are and real imaginary numbers part and of i the is 2 complex -1.
The number, numbers respectively. a and b are You known can
perform addition, subtraction, multiplication, and division for complex numbers
using the following formulas:
a + bi + c + di = (a + c) + (b + d)i
a + bi - (c + di) = (a - c) + (b - d)i
(a + bi) * (c + di) = (ac - bd) + (bc + ad)i
(a + bi)/(c + di) = (ac + bd)/(c2 + d 2) + (bc - ad)i/(c2 + d 2)
You can also obtain the absolute value for a complex number using the following
formula:
a + bi = 2a2 + b2
(A complex number can be interpreted as a point on a plane by identifying the
(a,b) values as the coordinates of the point. The absolute value of the complex
number corresponds to the distance of the point to the origin, as shown
in Figure 13.10.)
Design a class named Complex for representing complex numbers and the
methods add, subtract, multiply, divide, and abs for performing complex-
number operations, and override toString method for returning a string repre-
sentation for a complex number. The toString method returns (a + bi) as a
string. If b is 0, it simply returns a. Your Complex class should also implement
Cloneable and Comparable. Compare two complex numbers using their absolute values.
Provide three constructors Complex(a, b), Complex(a), and Complex().
Complex() creates a Complex object for number 0, and Complex(a) cre-
ates a Complex object with 0 for b . Also provide the getRealPart() and
getImaginaryPart() methods for returning the real part and the imaginary part
of the complex number, respectively.
Draw the UML class diagram and implement the class. Use the code at https://
liveexample.pearsoncmg.com/test/Exercise13_17.txt to test your implementa-
tion.
 */

import java.util.Scanner;

public class Ex13_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        Complex num1 = new Complex(real1, imag1);
        System.out.print("Enter the second complex number: ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        Complex num2 = new Complex(real2, imag2);

        System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
        System.out.println(num1 + " - " + num2 + " = " + num1.subtract(num2));
        System.out.println(num1 + " * " + num2 + " = " + num1.multiply(num2));
        System.out.println(num1 + " / " + num2 + " = " + num1.divide(num2));
        System.out.println("|" + num1 + "| = " + num1.abs());
        System.out.println(num1.equals(num2));
        System.out.println(num1.getRealPart());
        System.out.println(num1.getImaginaryPart());

    }
}

class Complex implements Cloneable, Comparable<Complex> {
    double a = 0;
    double b = 0;

    public Complex() {}

    public Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex num2) {
        double realPart = this.a + num2.getRealPart();
        double imaginaryPart = this.b + num2.getImaginaryPart();

        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex num2) {
        double realPart = this.a - num2.getRealPart();
        double imaginaryPart = this.b - num2.getImaginaryPart();

        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex num2) {
        double realPart = this.a * num2.getRealPart() -
                this.b * num2.getImaginaryPart();
        double imaginaryPart = this.b * num2.getRealPart() +
                this.a * num2.getImaginaryPart();

        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex num2) {
        double realPart = ((a * num2.getRealPart() + b * num2.getImaginaryPart()) /
                (Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2)));
        double imaginaryPart = (b * num2.getRealPart() - a * num2.getImaginaryPart()) /
                ((Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2)));

        return new Complex(realPart, imaginaryPart);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return "(" + a + " + " + b + "i)";
    }

    @Override
    public int compareTo(Complex num) {
        return Double.compare(this.abs(), num.abs());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Complex)
            return (this.compareTo((Complex)other) == 0);
        return false;
    }
}