package day49_Polymorphism;

public class Tester extends Employee {

    static {
        String jobTitle = "Tester";
    }

    @Override
    public void work() {
        System.out.println("Tester is working");
    }

    public Tester (String name, long id, double salary, long SSN) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.SSN = SSN;
    }
}
