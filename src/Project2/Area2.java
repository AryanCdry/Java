package Project2;
import java.util.Scanner;
public class Area2 {
    public static void main(String[] args) {
        double pi=3.242;
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius= scc.nextInt();
        double area = radius * radius * pi;
        System.out.println(area);
    }
}
