package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class QuizReview {
    public static void main(String[] args) {

        /*
        1. write  a program that can remove all the special characters from a list of Character

        2. write a program that can remove all the numbers that can divisible by 3 or 5 in arraylist

         */

        // remove special characters:
        Predicate<Character> digits = c -> (c >= 33 && c <=47) || (c >= 58 && c <=64)  ; // special characters from ascii table
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','B', '!', '?', '5', '@', '&', '+'));
        chars.removeIf(digits);
        System.out.println(chars);


        //remove numbers divisible by 3 or 5:
        Predicate<Integer> divisibleBy3or5 = Y -> Y % 3 ==0 || Y % 5 ==0;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(divisibleBy3or5);
        System.out.println(list);


        //5, 9, 10, 11

        //# 5:
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick", "Bran"));
                                //    0       1       2       3

        if (names.remove("Bran")) { //true  // {"Robb", "Rick", "Bran"};
            names.remove("John"); // {"Robb", "Rick", "Bran"};
        }
        System.out.println(names);

        //# 9:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); //1, 2, 3, 4, 5

        // {1, 2, 3, 4, 5}  ==> {5, }

        numbers.set(0, numbers.get(4) ); // {5, 2, 3, 4, 5}
        // set(0, 5)

        //{5, 2, 3, 4, 5}
        numbers.set(4, numbers.get(0)); // {5, 2, 3, 4, 5}
        // set(4, 5)

        System.out.println(numbers);

        System.out.println("==============================");
        //# 11 :

        ArrayList<Integer>  nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        // { 1, 2, 3, 4, 5, 6, 7 }

        for (Integer each : nums) { // each: 1, 2, 3, 4, 5, 6, 7
            if (each % 2 != 0) {
                continue;
            }

            System.out.print(each + " "); //2,
            break;
        }




    }


}
