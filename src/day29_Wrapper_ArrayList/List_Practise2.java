package day29_Wrapper_ArrayList;
/*
     1. create a list of Integers
     2. add 5 Integers to it
     3. return the maximum number from the list
      */

import Resources.Library;
import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.ArrayList;

public class List_Practise2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);

        int maximum = Integer.MIN_VALUE; //each is greater than min value  //.. 400, 800
//        int maximum = list.get(0); // or u can use this

        for (int i = 0; i < list.size(); i++) { //i: 0, 1, 2, 3, 4

            if (list.get(i) > maximum) {  //list.get(i) each index
                maximum = list.get(i);
            }

        }


        System.out.println(maximum);

        //For each:

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list) {

            if (each > maximum2) {
                maximum2 = each;
            }

        }

        System.out.println(maximum2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5000);
        list2.add(200);
        list2.add(300);

        int maximum3 = Library.max(list2);

        System.out.println(maximum3);
    }

    public static int max(ArrayList<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) { //i: 0, 1, 2, 3, 4

            if (list.get(i) > maximum) {  //list.get(i) each index
                maximum = list.get(i);
            }

        }

  return maximum;
}



    }



