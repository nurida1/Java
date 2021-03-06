package Practise.day22;
/*
Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 2010-2012 as well all vehicles in its Guzzler line from model years 2015-2018. A boolean variable named recalled has been declared.
Given a variable year and a String model write a statement that prints true to recalled if the values of year and model match the recall details and prints false otherwise.
 */
import java.util.Scanner;

public class ReplItCars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

//2010-2012- Extravagant, 2015-2018-Guzzler

        if (model.equalsIgnoreCase("Extravagant")) {
            if (year >= 2010 && year <= 2012) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        } else if (model.equalsIgnoreCase("Guzzler")) {
            if (year >= 2015 && year <= 2018) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}