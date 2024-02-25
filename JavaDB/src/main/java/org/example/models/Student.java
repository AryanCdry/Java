package org.example.models;

public class Student {
    int roll;
    String name;
    String grade;

    public Student(int roll, String name, String grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }

    public Student(int id, int roll, int name, int grade) {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
