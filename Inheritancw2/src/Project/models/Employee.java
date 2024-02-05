package Project.models;

public class Employee extends Members{
    String department;

    public Employee(String name, int age, int contact, String address, double salary, String department) {
        super(name, age, contact, address, salary);
        this.department = department;
    }
}

