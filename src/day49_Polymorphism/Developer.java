package day49_Polymorphism;

public class Developer extends Employee{

    static {
        String jobTitle = "Developer";
    }

    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    public Developer (String name, long id, double salary, long SSN) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.SSN = SSN;
    }

}
