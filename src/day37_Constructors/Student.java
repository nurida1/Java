package day37_Constructors;

public class Student {

    // name, age, gender(M/F), and university

    String name ;
    int age;
    char gender;
    String university;

    // here I am going to create a constructor where I can pass the 4 parameters every time I create an object like this:
    public Student (String name, int age, char gender, String university) { //constructor, same functionality as bellow method, executes as soon as u create an object
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

    }

    public void setInfo( String name, int age, char gender, String university ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

        public String toString() {
        return "Name: " + name + " age: " + age  + " gender: " +gender + " university: " + university;





    }



}
