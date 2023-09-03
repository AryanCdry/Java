package Project2;
import java.util.Scanner;

public class SI2 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = scc.nextInt();
        System.out.println("Enter time: ");
        int t = scc.nextInt();
        System.out.println("Enter rate of interest: ");
        double r = scc.nextDouble();
        double si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }

    public static class Gravity {
        public static void main(String[] args) {
            double G= 6.67 * Math.pow(10,-11);
            double M= 6 * Math.pow(10, 24);
            double r=6.38 * Math.pow(10, 6);
            double g= (G*M)/(r*r);
            System.out.println(g);


        }
    }

    public static class Money {
        public static void main(String[] args) {
            Scanner scc = new Scanner(System.in);
            System.out.println("Enter NPR amount: ");
            int npr = scc.nextInt();
            double exchange_rate = 0.0075;
            double amount= npr*exchange_rate;
            System.out.println(amount);
        }
    }

    public static class Temperature{
            public static void main(String[] args) {
                Scanner scc= new Scanner(System.in);
                System.out.println("Enter Fahrenheit: ");
                double fahrenheit= scc.nextDouble();
                double celsius = (fahrenheit-32)* 5/9;
                System.out.println(celsius);
            }
        }
}