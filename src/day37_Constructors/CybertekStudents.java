package day37_Constructors;

public class CybertekStudents {

    static String schoolName = "Cybertek University"; //static variable
    String studentName ; // instance variable : must be provided
    int groupNumber;   // instance variable : must be provided
    String batch;       // instance variable : must be provided


    // can I initialize those variables in the constructor? Yes I can
    // If I initialize them, How many arguments must be passe? how many MUST BE provided? Only 3 = instance variables
    // whereas the static variable can be initiated in the Constructor like this:

    public CybertekStudents ( String studentName, int groupNumber, String batch ) {
       // schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;


    }

    public  String toString() {

        return "Name: " + studentName +", Batch: " + batch +
                ", in group: " + groupNumber + ", School name: " + schoolName;
    }
}

class CObjects {

    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents("Nurida", 3, "Batch 18");
        student1.schoolName = "MIT";

        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Saban", 12, "Batch 18");
        System.out.println(student2);

    }


}


