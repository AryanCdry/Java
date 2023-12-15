package models;

public class Students {
    int grade = 12;
    String name;
    String section;
    int roll_no;
    boolean passed;
    int[] marks;

    public Students(String name, String section, int roll_no, boolean passed, int[] marks) {
        this.name = name;
        this.section = section;
        this.roll_no = roll_no;
        this.passed = passed;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public boolean isPassed() {
        return passed;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getPercentage() {
        return calculatePercentage();
    }

    public double calculatePercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return ((double) totalMarks / (marks.length * getFullMarks())) * 100;
    }

    // Display information including percentage
    public void displayInformation() {
        String studentName = this.name;
        String section = this.section;
        int rollNo = this.roll_no;
        boolean result = this.passed;
        double percentage = calculatePercentage();
    }

    public static int getFullMarks() {
        return 100;
    }
}
