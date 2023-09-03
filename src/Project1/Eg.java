package Project1;
import java.util.Scanner;

public class Eg{
    public static void main(String[] args) {
        String name;
        // creating name of scanner

        Scanner scc = new Scanner(System.in);
        // displaying message for input

        System.out.println( "Enter Your Name  :");
        // taking the value of input and string in variable
        name = scc.next();
        System.out.println("The name is " + name );
    }
}
