package OfficeHours.Practise_05_30_2020;

public class Student {
 /*
    Student:
			 ins variables: name, id
			 intsance methods: toString
     */


    String name; // ins variable (each object gets a copy of ins var)
    long id; // ins variable (each obj gets a copy of ins var)
    static String schoolName = "Cybertek"; // static variable (ONE copy only for all objects). This is a member of class ==> can be shared by objects

    public String toString() {

        return "Name: " + name + ", id: " + id + ", School Name: " + schoolName;
// instance method can call instance variables, instance methods, static variables
    }

    //Here I will create a STATIC method that will only need a static variable to print school name:
    public static void printSchoolName() {
        System.out.println(schoolName + " School");
        // static method can only call or use static.
    // this method can be called using the class name (class Student here ). I do not need to create an object to call this method.
    }
}
// Here I will create another class for my objects: ( Class must not have public - only one class can have it)
class studentObjects {
    public static void main(String[] args) {
         Student student1 = new Student();
         student1.name = "Madina";
         student1.id = 123;

         Student student2 = new Student();
         student2.name = "Emrah";
         student2.id = 456;

         student1.schoolName = "Harvard";
         student2.name = "Namik";

        System.out.println(student1);
        System.out.println(student2);
//        Name: Madina, id: 123, School Name: Harvard
//        Name: Namik, id: 456, School Name: Harvard

    }

}
