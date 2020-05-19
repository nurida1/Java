package day19_Arrays;

import java.util.Scanner;

/*
Create an array that holds 12 months names.
User should be able to enter month index and output should be: “The month name is <MonthName>”
 */
public class Month_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] month ={"January", "February", "March", "April","May","June","July","August","September","October","November","December" };

        for (int i = 1; i <= 12;i++) {
            System.out.println("Enter a number of Month");
            int num =input.nextInt();

            if (num<1 || num >12) {
                System.out.println("Invalid Entry");
            }else {
                System.out.println("The month name is:< "+month[num-1]+" >");
            }

        }


    }


}
