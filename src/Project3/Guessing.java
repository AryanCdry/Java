package Project3;
import java.util.Random;
import java.util.Scanner;
public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = scanner.nextInt();
            if (guess == targetNumber){
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
    }

}