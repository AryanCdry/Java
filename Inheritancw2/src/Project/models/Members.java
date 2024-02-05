package Project.models;


public class Members {
    String Name;
    int age;
    int contact;
    String address;

    double salary;

    public Members(String name, int age, int contact, String address, double salary) {
        Name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salary = salary;
    }

    public double Salary(int leaves) {
        int workingDays = 24 - leaves;
        return workingDays * salary;
    }

    public void giveInfo(){
        System.out.println("Name" + Name);
        System.out.println("Age" + age);
        System.out.println("Contact" + contact);
        System.out.println("Address" + address);
        System.out.println("Salaryperday" + salary);
    }
}
