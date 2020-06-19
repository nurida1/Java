package Practise.LinkedIn;

import java.util.Scanner;
public class ScannerString {

    //String are immutable
    //to change - need to create a new one
    public static void main(String[] args) {
        //System.out.println("Enter a word:");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

/*
        String userInput = sc.next();
        String upperCased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter); //e

        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase())); //true


 */

    }

}
