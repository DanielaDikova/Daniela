package Lecture8;

import java.awt.*;

public class Square extends Shape {

    @Override
    public double getArea(double a) {
        return a*a;
    }

    @Override
    public double getPerimeter(double a) {
        return 4*a;
    }
}
