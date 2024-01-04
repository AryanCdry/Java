package models;
import java.util.Arrays;
public class Order {
    // variables
    private String name;
    private String phone_number;
    private String[] items;
    private double[] prices;


    //using constructor
    public Order(String name, String phoneNumber, String[] items, double[] prices) {
        this.name = name;
        this.phone_number = phoneNumber;
        this.items = items;
        this.prices = prices;
    }
// using getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    //displaying the information
    public void displayInfo() {
        System.out.println("Order details:");
        System.out.println("Name: "+ name);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Items: " + String.join(", ", items));
        System.out.println("Price: " + Arrays.toString(prices));

    }

    // calculating and display the total price, VAT, and total price with VAT
    public void bill() {
        int totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        double vat = 0.13 * totalPrice;
        double totalWithVat = totalPrice + vat;

        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Items: " + String.join(", ", items));
        System.out.println("Price: " + Arrays.toString(prices));
        System.out.printf("Total Price: "+ totalPrice, vat, totalWithVat);
        System.out.printf("VAT: "+  vat);
        System.out.printf("Total with VAT: "+  totalWithVat);
    }
    }

