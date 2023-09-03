package Project4;
import java.util.Scanner;

public class FizBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Input = sc.nextInt();
        if ((Input%3==0) && (Input%5==0)){
            System.out.print("Fizz Buzz");
        }else if (Input%3==0){
            System.out.print("Fizz");
        }else if(Input%5==0){
            System.out.print("Buzz");
        }else {
            System.out.println(Input);
        }
    }
}
