package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        //List<String > list0 = new List(); u cannot create an object from interface List, it doesn't have constructor

        //ArrayList:
        // - array based class, uses array, singly linked --> retriving is faster (get() )
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.remove(0);
        //reference type decides what can be accessible.
        //the overridden object will be executed, otherwise in reference type will be executed


        //Linked list:
        // - each objects are doubly linked -> removing & adding are faster (remove(), add() )
        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        //Vector:
        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        //Stack: synchronized, pop method - LIFO
        Stack<Integer> stack = new Stack<> ();
        stack.add(10);

        System.out.println("=====================================");

        Stack <String> names = new Stack<>();
        names.add("Sha");
        names.add("Nurida");
        names.add("Zuura");
        names.add("Anna");
        names.add("Rustem");
        System.out.println(names); // [Sha, Nurida, Zuura, Anna, Rustem]

        String s1 = names.pop();//it will just remove the last object from the list
        System.out.println(s1);  //Rustem will be removed from the list

        System.out.println(names); //[Sha, Nurida, Zuura, Anna]

        String s2 = names.pop();
        System.out.println(s2);  //Anna
        System.out.println(names);   //[Sha, Nurida, Zuura]

        names.push("Phu");
        System.out.println(names); //[Sha, Nurida, Zuura, Phu]

        //synchronized - means thread safe









    }


}
