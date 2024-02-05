package Circle;


import Circle.models.Circle;
import Circle.models.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Volumn: " + circle.volumn());

        Cylinder cylinder = new Cylinder(5, 7.0);
        System.out.println("Cylinder Volume: " + cylinder.Area());
        System.out.println("Cylinder Volume: " + cylinder.Volume());


    }
}


