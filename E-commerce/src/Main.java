import models.Item;
import models.Order;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Coat", 120);
        Item item2 = new Item(2, "Pants", 25);

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        Order order1 = new Order(1, "First Order", items1);

        List<Item> items2 = new ArrayList<>();
        items2.add(item2);
        Order order2 = new Order(2, "Second Order", items2);

        printBill(order1);
        printBill(order2);

    }

    public static void printBill(Order order) {
        System.out.println("Order Name: " + order.getOrderName());
        System.out.println("Item            Price");

        for (Item item : order.getItems()) {
            System.out.println(item.getName() + "       " + item.getPrice());
        }
        System.out.println("Total for " + order.getOrderName() + ": NRS" + order.getOrderTotal());
        System.out.println();
    }

}
