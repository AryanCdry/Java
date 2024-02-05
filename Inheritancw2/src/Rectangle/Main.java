package Rectangle;

import Rectangle.models.Cuboid;
import Rectangle.models.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + r1.Area());


        Cuboid cuboid = new Cuboid(5, 4, 6.0);
        System.out.println("Cuboid Volume: " + cuboid.Volume());

    }
}

