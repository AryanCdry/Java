import models.Students;

public class Main {
    public static void main(String[] args) {
                int[] marks1 = {10, 20, 30, 40, 50};
                int[] marks2 = {60, 70, 80, 90, 100};

                Students student = new Students("Aryan", "Yala", 24064 , true, marks1);
        System.out.println("*******Result********");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Roll No.: " + student.getRoll_no());
        System.out.println("Marks: " + student.getMarks() );
        System.out.println("Percentage: " + student.getPercentage() + "%");

                // Using displayInformation function
                student.displayInformation();
            }
        }




