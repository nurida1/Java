package day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoop {
/*
        for (DataType variableName: ArrayName) {
 }
 */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; //length =4

        for (int eachElement : nums) {
            System.out.println(eachElement);
        }


        String [] students = {"Muhtar","Asiya","Murodil"};

        for (String eachStudent: students) {
            System.out.println(eachStudent);
        }
// EX: FOREACHLOOP

        int [] arr1 = {10,2,3,4,5,6,7,8,9,1};
        Arrays.sort(arr1); // [1,2,3,4,5,6,7,8,9,10]

        for (int each : arr1) {

            if (each<5) { //to skip 5 4 3 2 1
                continue;
            }

            System.out.println(each);
        }
        System.out.println("============================");
        // for each loop=  NOT REVERSE
        String sentence = "I like Java"; // Java like I

        String [] words = sentence.split(" "); //[I, like, Java]

        for(String eachWord : words) { // 0 ~ 2
            System.out.println(eachWord); //
        }

        System.out.println("============");
        // use advanced forloop for reverse:

        for (int i = words.length-1; i >=0; i--) {
            System.out.println(words[i]);
        }














    }

}