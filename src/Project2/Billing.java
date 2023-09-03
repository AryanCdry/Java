package Project2;
import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple= 100;
        int banana = 200;
        int mango = 300;
        double price = 0;
        double Discountrate = 0.12;
        double vatrate = 0.08;
        System.out.println("Available items:");
        System.out.println("1. Apple");
        System.out.println("Price: 100");
        System.out.println("2. Banana");
        System.out.println("Price: 200");
        System.out.println("3. mango");
        System.out.println("Price: 300");
        System.out.print("Enter the item number: ");
        int itemNumber = sc.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
        if (itemNumber == 1) {
            price = apple * quantity;
        } else if (itemNumber == 2) {
            price = banana * quantity;
        } else if (itemNumber == 3) {
            price = mango * quantity;
        } else {
            System.out.println("Invalid item number.");
        }
        double discountAmt = price * Discountrate;
        double vatAmt = price * vatrate;
        double totalprice = price - discountAmt + vatAmt;
        System.out.println("Invoice Details");
        System.out.println("Items: " + itemNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount Amount: " + discountAmt);
        System.out.println("VAT Amount: " + vatAmt);
        System.out.println("Total price:" + totalprice);

    }
}
