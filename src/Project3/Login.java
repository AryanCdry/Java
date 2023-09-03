package Project3;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String username = "Aryan";
        String password = "asd";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String name = sc.nextLine();
        System.out.print("Enter password: ");
        String Password = sc.nextLine();
        if (name.equals(username) && Password.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}