package Project3;
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter a number");
        double num2 = sc.nextDouble();
        System.out.println("Enter a operator: ");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalide");
        }
    }
}
