package Assignment2;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String name = sc.next().toLowerCase();
         String reverse = "";
        for( int i =name.length()-1 ; i>=0; i--){
            char c = name.charAt(i);
            reverse = reverse.concat(String.valueOf(c));
        }
        if (reverse.equals(name)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }
}
