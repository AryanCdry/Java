package Circle.models;

import Circle.models.Circle;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double Area() {

        return area() * height;
    }
    public double Volume() {

        return 2* Math.PI*radius*height;
    }
}