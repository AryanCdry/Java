package Project3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter a number");
        double num2 = sc.nextDouble();
        System.out.println("Enter a operator: ");
        String operator = sc.next();
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }else {
            System.out.println("Invalide");
        }
        System.out.println(result);
    }
}
