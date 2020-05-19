package day29_Wrapper_ArrayList;

import java.util.ArrayList;

/*
     1. create a list of Integers
     2. add 5 Integers to it
     3. return the maximum number from the list
      */
public class List_breakWarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(33);
        numbers.add(11);
        numbers.add(95);
        numbers.add(35);
        numbers.add(29);

        System.out.println(numbers);

        Integer max = Integer.MIN_VALUE;

        for (Integer each : numbers) {
            if (each >max) {
                max = each;
            }

        }
        System.out.println(max);


    }


}
