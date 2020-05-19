package day37_Constructors;

public class StudentObject {
    // when we create object from class==> we have to give existing constructor
    // I don't yet have a constructor that passes parameter
    // in order to create the object student, I have to use the default constructor
    // to set info of my object I have to call the setInfo() method like this:
    // st1.setInfo("Marina", 34, 'F', "Cybertek");
    // but that's a one extra step for me
    public static void main(String[] args) {

        Student student1 = new Student("Marina", 25, 'F', "Cybertek" ); //constructor
//        student1.setInfo("Nurida", 25, 'F', "Cybertek"); //no need of setInfo
        System.out.println(student1);

        Student student2 =new Student("Nurida", 27, 'F', "Harvard" );
        System.out.println(student2); // advantage of this Constructor: I don't have to call the setInfo() method
        // I can get same result as soon as I create the object

        }
    }





