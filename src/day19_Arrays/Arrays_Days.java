package day19_Arrays;

import java.util.Scanner;

/*
Create an array that holds the days User
should be able to enter the day index and output should be: “Today is Monday”
 */
public class Arrays_Days {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"} ;

        for (int i =0; i<=7; i++){

            System.out.println("Enter a number of day:");
            int num = input.nextInt();

            if (num < 1 || num > 7) {
                System.out.println("Invalid entry");
            }else{
                System.out.println("Today is "+ day [num-1]);
            }


        }
    }

}
