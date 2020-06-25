package day52_Collection;

import java.util.*;

public class Collections_utility {
    //Collection - interface
    //Collections - class

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4) );
        Collections.sort(list1); // as sort method is static therefore u can coll it through class name Collections
        System.out.println(list1); //[10, 9, 8, 7, 6, 5, 4]

        System.out.println("=========================================");
        //1.write a program that can remove the duplicates and print out in sorted (ascending) order.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,4,4,1,24,4,5,2,23, 3,4,2) );

        /*
        TreeSet<Integer> sorted = new TreeSet<>( nums );//in the set format, we need to add to Array List
        nums = new ArrayList<>(sorted); //
        System.out.println(sorted);
         */

        nums = new ArrayList<>(new TreeSet<>(nums));
        System.out.println(nums);

        System.out.println("============================================");
        //2. write a program that can removed the duplicates from an arraylist. Do Not change the order
        // [6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 4] ==> [6, 5, 4]

        //removes duplicates and doesn't change the order

        ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 4));

        list = new ArrayList<>(new TreeSet<>(list));//[4, 5, 6]
        list = new ArrayList<>(new HashSet<>(list));//[6, 5, 4]

        System.out.println(list); //[6, 5, 4]

        System.out.println("===========================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "B", "C", "B", "D"));

        boolean result = Collections.frequency(letters, "A") == 1; //u can apply to assert in selenium
        //without ==1 it returns you int

        System.out.println(result); //true





    }

}
