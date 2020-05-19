package Practise.practise;
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.next();

        String result =""; // to store the unique characters

        for (int j = 0; j < str.length()-1; j++) {//to repeat inner loop, takes 2nd, 3rd ch-s.. to check with next characters
            char ch2 = str.charAt(j);
            int count = 0;               // declares how many times character occured in str

            for (int i = 0; i <= str.length()-1; i++) { //this loop takes character and checks
                char ch = str.charAt(i); //charAt(i) returns char at index 0,1, 2, 3, 4, etc
                if (ch == ch2) {         // check how mnay time the character is  occured in the string
                    count++;             // when char equal to another character then increase count by 1
                }
            }
            if (count == 1) {            // the character at index j is unique , will be concated to the result
                result += ch2;
            }

        }
        System.out.println(result);





    }
}
