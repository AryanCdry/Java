package Assignment2;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String x = scanner.next();
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }
        System.out.println("Sum is: " + sum);
    }
}



