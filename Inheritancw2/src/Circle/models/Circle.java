package Circle.models;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public double volumn() {
        return 1.33 * Math.PI * radius * radius * radius;
    }

}

