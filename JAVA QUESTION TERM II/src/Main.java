import models.T_shirt;
import models.Order;
public class Main {
    public static void main(String[] args) {
        T_shirt t1 = new T_shirt("Gorkhali Batman", 572, 12345, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});
        t1.describeTShirt();
        Order o1 = new Order("Gopal Sharma", "0486756465", new String[]{"572"}, new double[]{12345});
        o1.displayInfo();
        o1.bill();

    }
}