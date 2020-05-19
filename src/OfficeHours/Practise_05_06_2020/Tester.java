package OfficeHours.Practise_05_06_2020;

/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeId;


    public void setInfo(String name, String jobTitle, double salary, long employeeId) {

        this.name =name;  //user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;
}

public String toString () {  //u cannot use void-since u need value to print out
        return "Name: " + name + ", job title: " + jobTitle + ", salary: $" +salary
                +", ID: " +employeeId;

}


    public void smokeTesting() {
        // int name = 100;
        System.out.println(this.name + " is doing smoke test"); //if int name =100 -> paste this.name in print statement, even if u use it, still fine

    }

    public void creatingTicket () {
        System.out.println(name + " is creating ticket on Jira");
    }







}
