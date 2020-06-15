package day49_Polymorphism;

public abstract class Employee {
    String name;
    long id;
    static String jobTitle;
    double salary;
    long SSN;


    public abstract void work ();

    public String toString () {

        return "Name: " + name + ", ID: " + id + ", Job title: " + jobTitle + ", salary: "+salary + ", SSN: " + SSN;
    }

}
