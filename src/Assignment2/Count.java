package Assignment2;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                x++;
            } else {
                y++;
            }
        }
        System.out.println("Vowels: " + x);
        System.out.println("Consonants: " + y);
    }
}


