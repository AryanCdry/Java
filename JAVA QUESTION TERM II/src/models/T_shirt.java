package models;

public class T_shirt {
// variables
        String name;
        int product_code;
        double price;
        String brand;
        String description;
        String[] size;

    // using Constructor
    public T_shirt(String name, int product_code, int price, String brand, String description, String[] size) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = size;
    }

    // using getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    // displaying information
    public void displayInfo() {
        System.out.println("T-shirt details:");
        System.out.println("Item name: " + name);
        System.out.println("Product code: " + product_code);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + String.join(", ", size));
    }

    //method to display info of description
    public String describeTShirt() {
        displayInfo();
        return "Description: " + description;
    }
}