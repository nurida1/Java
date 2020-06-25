package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet","Osman", "Ozgur", "Ozgur","Ozgur","Ozgur", "me too" ) );
        System.out.println(names);

       Iterator<String> it = names.iterator();
       while (it.hasNext() ) { //it.hasNext - will not be executed when there is nothing to iterate
            String s = it.next();
            s = s.toLowerCase();
            //if (s.toLowerCase().contains("m")) {
           if (s.contains("m") || s.contains("M") ) {
                it.remove();
            }
       }

       System.out.println(names);

        System.out.println("====================================================================");
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet","Osman", "Ozgur", "Ozgur","Ozgur","Ozgur", "me too" ) );
        System.out.println(names); // [Yucel, Sha, Ozgur]

        for (Iterator<String> I = students.iterator(); I.hasNext();  ) {
           String s = I.next(); // retrieve each object
           if (s.contains("m") || s.contains("M")) {
               I.remove(); //to remove m
           }
        }
        System.out.println(students); // [Yucel, Sha, Ozgur]

        System.out.println("======================================================================");
        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet","Osman", "Ozgur", "Ozgur","Ozgur","Ozgur", "me too" ) );
        System.out.println(names); // [Yucel, Sha, Ozgur]
        n.removeIf( s-> s.contains("m") || s.contains("M") );
        System.out.println(n); //[Yucel, Sha, Ozgur]

        //u need to know how Iterator works
        //this only works for version 8 or higher

        System.out.println("========================================================================");
        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet","Osman", "Ozgur", "Ozgur","Ozgur","Ozgur", "me too" ) );

        T.removeAll( Arrays.asList("Mehmet", "Ozgur", "Mohammed") );
        System.out.println(T);

        System.out.println("==========================================================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet","Osman", "Ozgur", "Ozgur","Ozgur","Ozgur", "me too"));

        R.retainAll( Arrays.asList("Yucel", "Sha", "Ahmet") );

        System.out.println(R);

        //addAll
        //retainAll
        //removeAll
        //containAll

        System.out.println("==============================================================================");
        List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

            //verify 5, 6, 9, 8 are contained in the list
        boolean result = list.containsAll(Arrays.asList(5, 6, 9, 8, 11)); //false, because 11 is not contained
        System.out.println( list.containsAll(Arrays.asList(5, 6, 9, 8)) );
        System.out.println( result );







    }

}
