package Project.models;

public class Manager extends Members {
    int specialization;
    public Manager(String name, int age, int contact, String address, double salary, int specialization) {
        super(name, age, contact, address, salary);
        this.specialization = specialization;
    }

}
