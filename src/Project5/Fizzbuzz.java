package Project5;

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i =0; i<=100; i++){
           if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            }else if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           } else {
                System.out.println(i);
            }
        }
    }
}