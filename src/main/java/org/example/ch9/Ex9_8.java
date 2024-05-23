package org.example.ch9;
/*
(The Fan class) Design a class named Fan to represent a fan. The class contains:
■■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
to denote the fan speed.
■■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
■■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
■■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
■■ A string data field named color that specifies the color of the fan (the default
is blue).
■■ The accessor and mutator methods for all four data fields.
■■ A no-arg constructor that creates a default fan.
■■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one com-
bined string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class then implement the class. Write a test program
that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
and turn it on to the first object. Assign medium speed, radius 5, color blue, and
turn it off to the second object. Display the objects by invoking their toString
method.
 */
public class Ex9_8 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}

class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        else
            return "Fan is off";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
