package day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {

    /*
    access - modifiers specifier return-type methodsName(Parameter)
    specifiers: static, final, abstract, synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list =  Collections.synchronizedList(list); //how do u make Array list synchronized?
        //synhcronized list, map, set of collections class
        //becames thread-safe

        //Collections.swap
                    //.sort
                    //.frequency
        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); //thread-safe

        System.out.println("===============================================================");

        //Remove duplicates:
        String [] arr ={"E", "B", "A", "D", "D", "C", "A"}; //EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr) );
        System.out.println(st);  //[E, B, A, D, C]
//        for (int i = 0; i < st.size()) {
        /*
        for ( String each : st) {
            st.add(each);
       }
         */


        //Remove duplicates:
        ArrayList<String > arrayList = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arrayList);
        System.out.println(st2);  //[E, B, A, D, C]




    }





   public synchronized void append() {


   }

}
