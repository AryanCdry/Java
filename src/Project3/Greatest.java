package Project3;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter first number");
        double num2 = sc.nextDouble();
        System.out.println("Enter first number");
        double num3 = sc.nextDouble();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }
}