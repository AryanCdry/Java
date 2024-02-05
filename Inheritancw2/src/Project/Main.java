package Project;

import Project.models.Employee;
import Project.models.Manager;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Aryan", 17, 99999999, "Sifal", 200, 1);
        System.out.println("Manager Salary: " + manager.Salary(2));

        Employee employee = new Employee("Ram", 16, 65354353, "GHar", 100, "department");
        System.out.println("Employee Salary:" + employee.Salary(3));
    }
}
