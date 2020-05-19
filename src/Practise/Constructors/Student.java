package Practise.Constructors;
/*
For the following objects create Student class template. •
Write code for the Student class and another class to test it. •
 This class has 4 properties: name,age,gender(M/F), and university

 */
public class Student {

    static String state = "US";
    String university;
    String name;
    int age;
    char gender;


public Student (String name, int age, char gender, String university) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.university = university;

}

public String toString () {

    return "Name: " + name + ", age: " + age + ", gender: " + gender + ", university: " +university + ", state: " + state;
}


}

class Object {
    public static void main(String[] args) {

        Student student1 = new Student("Nurida", 25, 'F', "Harvard");
           student1.state = "MA";

        Student student2 = new Student("Alice", 24, 'F', "MIT");

        Student student3 = new Student("Katrine", 35, 'F', "Stanford");

        System.out.println(student1 + "\n" + student2 + "\n" + student3 );

    }

}