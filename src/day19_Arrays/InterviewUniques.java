package day19_Arrays;
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */

public class InterviewUniques {

    public static void main(String[] args) {
        String str = "AZBAZBCDERTYQA";

        String result = ""; //"B"  //to find unique character, and to store unique character in variable

        for (int j = 0; j <= str.length() - 1; j++) { //2nd. this loop is going to repeat inner loop takes 2nd, 3rd .. to check with another letters

            int count = 0; //to count the occurence of the character

            for (int i = 0; i <= str.length() - 1; i++) {   //1st. this loop takes every character and checks
                if (str.charAt(i) == str.charAt(j)) { //charAt(i) returns char at index 0,1, 2, 3, 4, etc
                    // ex.     A  == A
                    //         A == Z
                    count++;   // when char equal to another character then increase count by 1
                }
            }
            if (count == 1) {  // if character at the index j is unique, will be concated to the result
                result += str.charAt(j);
            }

        }

        System.out.println(result);
    }
}
