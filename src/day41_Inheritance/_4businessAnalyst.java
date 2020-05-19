package day41_Inheritance;
/*
creata a constructor that can initialize all the attributes of developer
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */
public class _4businessAnalyst extends _4Employee {

    public void writingRequirement () {
        System.out.println(name + " is writing requirements");
    }

    public void gathering () {
        System.out.println(name + " is gathering information from the client");
    }

    public _4businessAnalyst (String name, char gender, long id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

}
