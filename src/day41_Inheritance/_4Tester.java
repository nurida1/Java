package day41_Inheritance;
/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
 */
public class _4Tester extends _4Employee {

    public void reportingBug() {
        System.out.println(name + "is reporting bug");
    }

    public void testing () {
        System.out.println(name + "is testing user stories");
    }

    public _4Tester (String name, char gender, long id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

}
