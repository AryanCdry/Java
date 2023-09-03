package Project1;
import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
