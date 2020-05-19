package day16_ForLoop;

import java.util.Scanner;

/* remove duplicates characters from a string
abcdabcd ==> abcd

 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.next();

        String result = ""; //"AB" we store expected result in this variable

        for (int i = 0; i <= str.length()-1; i++) {  //0,1,2,3
/*
            if (!result.contains("" + str.charAt(i))) {

                result += str.charAt(i);
            }
*/
        if (result.contains(""+str.charAt(i) )) {  //if the string result does not contains str.charAt(i), then we concate it to the result,  if it does we will skip concatenation part.
            continue;
            }
            result += str.charAt(i); //only gets executed if str.charAt(i) is not contained in the result

        }
        System.out.println(result);
    }
}
