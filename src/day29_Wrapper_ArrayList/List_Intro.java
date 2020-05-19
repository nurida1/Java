package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        //add():

        // ArrayList<DataType> listName = new ArrayList<DataType>();

        ArrayList<Integer> scores = new ArrayList<Integer>(); // size :0
                                                    //add five elements, size:5
                                                    // remove two elements, size: 3


            scores.add(10);   //Autoboxing   size:1
            scores.add(20);   //Autoboxing,  size:2
            scores.add(30);   // size: 3

        System.out.println(scores);

        //get(index):
        Integer a1 = scores.get(2); //returns integer/ none autoboxing or unboxing

        int a2 = scores.get(2); //unboxing

        double a3 = scores.get(2);  //unboxing

        System.out.println(a3);

        // System.out.println(scores.get(100)); // index out of bond

        /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */



    }

}
