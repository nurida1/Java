package day06_Shorthnd_LogicalOperators;

import java.sql.SQLOutput;

public class SingleIfStatement {

    public static void main(String[] args) {


        boolean coldWeather = false;
        if(coldWeather) {
            //true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("=============================================");
//IF Example:
        int a = 200;
        boolean evenNumber = a % 2 ==0; //if a number can be devided by 2 without the remainder
 ///      boolean oddNumber = a % 2 !=0; // if a number cannot be devided by 2 evenly

        if (evenNumber) {
            System.out.println(a + " is even number ");
        }

 ///       if (oddNumber) {
            System.out.println(a + " is odd number");
        if (!evenNumber) { //if the number is not even number, then it must be odd
            System.out.println(a+" is odd number");







        }
    }

}
