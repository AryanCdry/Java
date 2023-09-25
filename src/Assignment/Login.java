package Assignment;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String password = "asd";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            if (pass.equals(password)) {
                System.out.println("Password successful!");
                break;
            } else {
                System.out.println("Incorrect password");}

        }
    }
}