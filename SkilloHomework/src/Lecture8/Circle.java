package Lecture8;

import java.awt.*;

public class Circle extends Shape {

    @Override
    public double getArea(double r) {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter(double r) {
        return 2*Math.PI*r;
    }
}
