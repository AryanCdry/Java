package models;
import java.util.List;

public class Order {
    int id;
    List<Item> items;
    public String orderName;

    public Order(int id, String orderName, List<Item> items) {
        this.id = id;
        this.orderName = orderName;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();

        }
        return total;
    }
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

}
