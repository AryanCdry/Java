package Rectangle.models;

public class Cuboid extends Rectangle {


    double h;

    public Cuboid(double l , double b, double h) {
        super(l, b);
        this.h = h;
    }

    public double getH() {
        return h;
    }
    public double Volume() {
        return Area() * h;
    }
}
