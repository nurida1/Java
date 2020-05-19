package Class_warmup;
/*
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
 */
public class Developers {

    String name;
    long employeeId;
    String JobTitle;
    double salary;

    public void setDeveloperInfo ( String name, long employeeId, String JobTitle, double salary ) {
        this.name = name;
        this.employeeId = employeeId;
        this.JobTitle = JobTitle;
        this.salary = salary;

    }

    public void coding () {

        System.out.println(name + " is coding");
    }

    public void fixingBugs () {

        System.out.println(name + " is fixing bugs");
    }




}
