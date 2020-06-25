package day52_Collection;

import java.util.*;

public class Practice {

    /*Tasks:
 1. write a program that can remove the duplicated characters from String
 2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"; //1.remove duplicates ab 2.sort => ab
            str2 ="baba";    //remove duplicates ba 2.sort => ab
            output: true
*/
    public static void main(String[] args) {

        String str = "ABABABCDEF"; //["A", "B", "C", "D", "E", "F"]
        String [] arr = str.split(""); //returns String array
        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(", ", "");
        System.out.println(str); //ABCDEF



        /*
        //1st short solution:
        String str = "ABABABCDEF"; //["A", "B", "C", "D", "E", "F"]
        String [] arr = str.split(""); //returns String array
        str = "";
          for ( String each : new LinkedHashSet<>(Arrays.asList(arr)) ) {
              str += each;
          }
        System.out.println(str); //ABCDEF
         */

    /*
    2nd solution:
        String str = "ABABABCDEF"; //["A", "B", "C", "D", "E", "F"]
        String [] arr = str.split(""); //returns String array
        LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList(arr) );

        System.out.println(ls);
        String result = "";

        for (String each : ls) {
            result += each;
        }

        System.out.println(result);
 */

        System.out.println("====================================================");
        //2nd Practice assignment:
       /*
        String str1 = "abababab";
        String str2 = "baba";

        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        TreeSet <String> t1 = new TreeSet(Arrays.asList(arr1) );
        TreeSet <String> t2 = new TreeSet(Arrays.asList(arr2) );

        System.out.println(t1); // [a, b]
        System.out.println(t2); //[a, b]

        str1 = t1.toString();
        str2 = t2.toString();

        System.out.println(str1.equals(str2));
        */

        String str1 = "ababababC"; //abC
        String str2 = "baba";      //ab

        str1 = new TreeSet<>( Arrays.asList(str1.split("")) ).toString() ;
        str2 = new TreeSet<>( Arrays.asList(str2.split("")) ).toString() ;

        System.out.println(str1.equals(str2));


    }
}
