package org.example.ch20;

import org.example.ch11.GeometricObject;

import java.io.Serializable;
import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable {
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if (area1 < area2)
            return -1;
        else if (area1 == area2)
            return 0;
        else
            return 1;
    }
}