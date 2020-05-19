package day37_Constructors;
/*
	1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
 */
public class Employee {

    String name;
    long id;
    long ssn;
    String JobTitle;
    double salary;
    char gender;

    // here we create our setInfo method. Can we create this method as static? No we cannot.
    // Because we are using instance variables in this method ==> we need to create instance method
    public void setInfo (String name, long id, long ssn, String JobTitle, double salary, char gender) {

        this.name  = name;
        this.id = id;
        this.ssn = ssn;
        this.JobTitle = JobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString () {
        return  "Name: " + name + " id: " + id + " ssn: " + ssn + " job title: "  + JobTitle +
                " salary: " + salary + " gender: " + gender;
    }






}
