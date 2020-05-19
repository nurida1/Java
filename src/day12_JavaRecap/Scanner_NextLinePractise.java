package day12_JavaRecap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Scanner_NextLinePractise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //7925Enter   //Enter  //22034Enter //Enter

        //7925 JonesBranch Dr, McLean VA, 22034
        //fullAddress: Building - number Street, city, state zipcode

        System.out.println("Building Number: ");
        String Bnumber = input.next(); //int Bnumber = input.nextInt(); //7925Enter   //7925

        System.out.println("Building number is: "+Bnumber);

        input.nextLine(); //used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine ();

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt(); //22034 Enter

        input.nextLine();

        System.out.println("Enter the city name and state separated by comma and space: ");
        String cityState = input.nextLine();

        String fulladdress = Bnumber+" "+street+", "+cityState+" "+zipCode;

        System.out.println(fulladdress);

        input.close();  //closes the scanner






    }



}
