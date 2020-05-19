package day15_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        String initials2 = firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();
    //    initials = initials.toUpperCase();


        String initials =""+ firstName.charAt(0) + lastName.charAt(0); //returns string
//                 makes string       char                 char

        initials = initials.toUpperCase();
        System.out.println(initials);
        System.out.println(initials2);


    }


}
