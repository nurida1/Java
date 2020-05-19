package day31_BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7));

        ArrayList<Integer> result = new ArrayList<>();   // 1 2 3
        //expected result: [1, 2, 3]

        for (Integer each : list) {        //each: 1, 1, 2, 2, 3, 3

            if (!result.contains(each)) {
                result.add(each);          //if result does not contain each ==> true, than +each [i]

            }
        }

        System.out.println(result);

        System.out.println("=============================================");
        /*
        write a program that can remove duplicates from an array of integer
                    do not use for each
         */

        Integer[] arr1 = {1, 1, 2, 2, 3, 3};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();  // 123

        for (int i = 0; i < arr1.length; i++) {

            if (!nonDuplicates.contains(arr1[i])) {
                nonDuplicates.add(arr1[i]);            //if result does not contain each ==> true, than +each [i]
            }
        }
    /*
    figure out why we cannot use it:
    +,
    []
    +=
     */




        System.out.println(nonDuplicates);

    }
}

