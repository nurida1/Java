package OfficeHours.Practice_05_06_2020;
/*
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
 */
public class Developer {

    String name;
    long employeeId;
    String jobTitle;
    double salary;


    public void setInfo(String name, String jobTitle, double salary, long employeeId) {

        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {  //u cannot use void-since u need value to print out
        return "Name: " + name + ", job title: " + jobTitle + ", salary: $" + salary
                + ", ID: " + employeeId;

    }

    public void coding() {
        System.out.println(name + " is coding");
    }


    public void fixingBugs() {
        System.out.println(name + " is fixing bugs");
    }

}
