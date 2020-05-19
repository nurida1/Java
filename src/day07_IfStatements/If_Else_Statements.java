package day07_IfStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 0;

        if (number >= 0) {
            System.out.println(number + " is positive");

        } else { //otherwise
            System.out.println(number + " is negative");
        }
////////////////////////////////////////////////////////////

        /*
        if (number >= 0) {
            System.out.println(number + " is positive");
        }
        if (number < 0) {
            System.out.println(number + " is negative");
        }
*/
/*
 public static void main(String[] args) {
        int number = 100;
        if (number % 2 == 0) {

            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
*/

        /////////////////////////////////////////////////

        boolean evenNum = number % 2 ==0;
        if(evenNum) {
        System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
        /////////////////////////////////////////////////
        int age = 30;
        if(age >=21) {
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }
        ////////////////////////////////////////////////
  boolean testedPositiveForCorona = true;
        if(testedPositiveForCorona) {
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }






    }
}












