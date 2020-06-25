package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        //in order to remove: For loop and if i < 4 remove
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list); //[1, 2, 3, 4, 4, 5, 5] //partially removed duplicates <4

        System.out.println("=============================================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        list2.removeIf(p -> p < 4); // removeIf uses iterator internally
        System.out.println(list2); //[4, 4, 5, 5] - removed duplicates < 4

        System.out.println("==============================================================");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        //we can use iterator: u can remove objects during iteration
        //wil cointinue until no more objects to iterate
        Iterator<Integer> it = list3.iterator();

        //System.out.println(it.hasNext()); //returns boolean, true/ we have elements to iterate

        System.out.println(it.hasNext());
        System.out.println(it.next());

        while (it.hasNext()) {
           if ( it.next() < 4) {
            it.remove();
           }
        }
        System.out.println(list3); //[4, 4, 5, 5]

        System.out.println("==================================================================");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5 ));

        for (Iterator<Integer> I =list4.iterator(); I.hasNext(); ) {
            int num = I.next();
            if (num < 4) {
                I.remove();
            }
        }

    }
}
