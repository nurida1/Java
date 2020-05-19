package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */







public class school {
    public static void main(String[] args) {
        Student student1 = new Student();  //student1- local variable, you cannot use it outside the block
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Nurida", 30, 'F', 123, "B18");
        student2.setStudentInfo("Nadyr", 35, 'M', 345, "B18");
        student3.setStudentInfo("Jasmine", 4, 'F', 567, "B18");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll( Arrays.asList(student1, student2, student3) );

        for ( Student each : studentList ) {
            //System.out.println( each );
            System.out.println("name: " + each.name + ", ID: " + each.studentID);
        }



    }


}
