package day14_StringClass;

import java.util.Scanner;

/*
4. Ask user to enter a word. Print "really?"
if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */
public class SelfPractise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");

        String a =input.next();

        if (a.endsWith("ly")) {
            System.out.println("really?");
        } else {
            System.out.println("never mind");
        }

    }


}
