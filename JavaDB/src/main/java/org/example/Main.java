package org.example;

import org.example.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String STUDENT_TABLE = "STUDENTS";

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aryan", "12");
        String url = "jdbc:sqlite:mydb.db";
        String createQuery = "CREATE TABLE IF NOT EXISTS " + STUDENT_TABLE + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "roll INTEGER, " +
                "name TEXT, " +
                "grade TEXT)";

        String insertQuery = "INSERT INTO " + STUDENT_TABLE + " (roll, name, grade) VALUES (?, ?, ?)";
        System.out.println(insertQuery);

        String selectQuery = "SELECT * FROM " + STUDENT_TABLE;

        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");
            Statement statement = connection.createStatement();
            statement.execute(createQuery);
            System.out.println("Table created");

            PreparedStatement psm = connection.prepareStatement(insertQuery);
            psm.setInt(1, s1.getRoll());
            psm.setString(2, s1.getName());
            psm.setString(3, s1.getGrade());
            psm.execute();
            System.out.println("Data Added");

            ResultSet rs = statement.executeQuery(selectQuery);
            List<Student> studentList = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String grade = rs.getString("grade");

                Student s = new Student(id, roll, name, grade);

                studentList.add(s);
            }

            System.out.println(studentList.size());
            for (Student s : studentList) {
                System.out.println("Name: " + s.getName());
                System.out.println("Grade: " + s.getGrade());
            }

        } catch (SQLException e) {
            System.out.println("Cannot connect to DB");
            e.printStackTrace();
        }
    }
}
