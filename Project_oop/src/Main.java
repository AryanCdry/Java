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

        Students student2 = new Students("Ayush", "Yala", 24065 , true, marks2);
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Section: " + student2.getSection());
        System.out.println("Roll No.: " + student2.getRoll_no());
        System.out.println("Marks: " + student2.getMarks() );
        System.out.println("Percentage: " + student2.getPercentage() + "%");

        Students student3 = new Students("XYZ", "Yala", 24066 , true, marks1);
        System.out.println("Student Name: " + student3.getName());
        System.out.println("Section: " + student3.getSection());
        System.out.println("Roll No.: " + student3.getRoll_no());
        System.out.println("Marks: " + student3.getMarks() );
        System.out.println("Percentage: " + student3.getPercentage() + "%");
                student.displayInformation();
            }
        }









