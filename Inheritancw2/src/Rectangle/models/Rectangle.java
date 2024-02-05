package Rectangle.models;

public class Rectangle {

    double l;
    double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }

    public double Area() {
        return l * b;
    }
}

