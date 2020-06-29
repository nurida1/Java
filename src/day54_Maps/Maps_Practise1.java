package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practise1 {
    //create a map and store your classmate's names and birthday:
    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Zhenya", LocalDate.of(1965, 11, 29));
        classMates.put("Anil", LocalDate.of(1990, 9, 5));
        classMates.put("Saban", LocalDate.of(1990, 01, 30));
        classMates.put("Anna", LocalDate.of(1990, 4, 23));
        classMates.put("Namik", LocalDate.of(1453, 12, 2));
        classMates.put("Yucel", LocalDate.of(2005,12,28));

        classMates.put("Namik", LocalDate.of(1903, 04, 5));
        classMates.put("Anil", LocalDate.now()) ;

        System.out.println(classMates);
        System.out.println(classMates.size()); //size will be 6

        //remove(key);
        classMates.remove("Anil");
        System.out.println(classMates);

        System.out.println(classMates.get("Namik") );

        //contains:
        boolean r1 =  classMates.containsKey("Muhtar"); //false
        System.out.println(r1);

        boolean r2 =  classMates.containsKey("Anna"); //true
        System.out.println(r2);

       boolean r3 = classMates.containsValue(LocalDate.of(1990, 4, 5));
        System.out.println(r3);

        //put(key,value)
        //get(key)
        //size()

        System.out.println("=================================================");
        //LinkedHashSet - returns inserted order

//    create a map that conatins student names and Score
//                                        String    Integer
//                                    put 5 students names and thier scores
//            write a program that can print out the names of the students who scored less than 90
//
        LinkedHashMap<String, Integer>students = new LinkedHashMap<>();
        students.put("Adil", 92);
        students.put("Hunar", 89);
        students.put("Barzy", 75);
        students.put("Rahman", 93);
        students.put("Hardi", 80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();


        for ( String eachKey : students.keySet() ) {
            int eachValue = students.get(eachKey); //score
            if  (eachValue < 90 ) {
                badStudents.put(eachKey,eachValue);
                //System.out.println(eachKey); //name
            }else {
                goodStudents.put(eachKey,eachValue);
            }
        }

        System.out.println("bad students: "+ badStudents);
        System.out.println("good students: "+ goodStudents);


    }


}
