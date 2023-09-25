package Assignment;
import java.util.Scanner;

public class Billing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine();
        double totalcost = 0;
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter quantity of " + itemName + ": ");
            int itemQuantity = scanner.nextInt();
            System.out.print("Enter price of " + itemName + ": ");
            double itemPrice = scanner.nextDouble();

            double total = itemQuantity * itemPrice;
            totalcost += total;

            scanner.nextLine();
        }

        double vat = totalcost * 0.2;
        double discount = totalcost * 0.10;
        double TotalCost = totalcost + vat - discount;

        System.out.println(" Bill");
        System.out.println("Total Cost: " + totalcost);
        System.out.println("VAT :" + vat);
        System.out.println("Discount :" + discount);
        System.out.println("Final Total Cost:" + TotalCost);

    }
}