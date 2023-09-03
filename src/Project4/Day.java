package Project4;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int Input = sc.nextInt();
        switch (Input){
            case 1:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
