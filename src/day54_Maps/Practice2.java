package day54_Maps;

import java.util.LinkedHashMap;

public class Practice2 {
    /*
    // task:
    create a map that conatins student names and Score
                                        String    Integer
                                    put 5 students names and thier scores
            write a program that can print out the names of the students who scored less than 90
     */
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Nuri", 100);
        students.put("Emrah", 5);
        students.put("Renata", 95);
        students.put("Osman", 80);
        students.put("Aijan", 30);

        students.keySet();

        for ( String eachStudent :  students.keySet() ) {
            if (students.get(eachStudent ) < 90)  {
                System.out.println(eachStudent);
            }
        }

    }


}
