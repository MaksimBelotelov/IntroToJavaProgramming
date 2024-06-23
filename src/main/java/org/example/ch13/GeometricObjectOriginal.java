package org.example.ch13;

import java.util.Date;

public class GeometricObjectOriginal {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObjectOriginal() {
        dateCreated = new Date();
    }

    public GeometricObjectOriginal(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated +
                "\ncolor: " + color +
                "\nfilled: " + filled;
    }
}
