package day41_Inheritance.Task01;
/*
	creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
 */
public class Employee {

    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString () {
        return "Name: " + name + ", Job Title: " + jobTitle + ", salary: $" + salary + ", ID: "+id + ", gender: " + gender;
    }



}
