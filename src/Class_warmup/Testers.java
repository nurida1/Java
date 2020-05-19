package Class_warmup;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();

 */
public class Testers {

    String name;
    long employeeID;
    String JobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary) {

        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        double Salary = salary;


    }

    public void smokeTesting() {

        System.out.println( name + " is conducting smokeTesting" );

    }

    public void creatingTicket() {

        System.out.println( name + " is creating a ticket" );
    }



}
