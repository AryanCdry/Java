package Assignment;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        double totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
            }
            totalMarks += marks;
        }
        double percentage = (totalMarks / (subjects * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage <= 90 && percentage >= 70) {
            System.out.println("Grade: A");
        } else if (percentage <= 70 && percentage >= 60) {
            System.out.println("Grade: B+");
        } else if (percentage <= 60 && percentage >= 40) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Fail");
        }

    }
}
