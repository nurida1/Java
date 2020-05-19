package day41_Inheritance;
/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
 */
public class _4developer extends _4Employee {

    public _4developer (String name, char gender, long id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void fixingBug () {
        System.out.println(name + " is fixing bugs");
    }
    public void coding () {
        System.out.println(name + " coding");
    }






}
