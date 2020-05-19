package day22_Arrays_Loops;
/*
Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
        Arrays, scanner, for loop, for each loop, substring
 */

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWithArrays {
    public static void main(String[] args) {

        //1st part:
        Scanner input = new Scanner(System.in);
        String arr [] = new String [5];

        for (int i = 0; i < arr.length; i++) {
            arr [i] = input.next();             //pprint each element
        }
        System.out.println(Arrays.toString(arr));

        //2nd part:
        for (String each : arr ) {
        // String str = each.substring(0,3); // first three characters, to include 2nd index, in substring ending index is always excluded

        String str = each.charAt(0) +""+ each.charAt(each.length()-1); //to print first and last characters
            System.out.println(str);
        }

    }




}
