package day17_WhileLoop;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int MaxNumber = -2147483647;  // any number the user provided will be greater than this number
                             // first user entered value will be initialized to MaxNumber
            //MaxNumber = 3;

        int MinNumber = 2147483647;
           // MinNumber = 0;

        for (int i = 1; i<6; i++) { // i: 1,2,3,4,5 // this condition desides execution, if you want to enter 10 number => i<= 10; i<11

            System.out.println("Enter a number");
            int num = input.nextInt();  // 1,3,-2, 0, 0

            if (num > MaxNumber) { // to compare each user inputs, and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if (num < MinNumber) {
            MinNumber = num;
            }
            }
            System.out.println("Maximum Number: " +MaxNumber);
            System.out.println("Minimum Number: " +MinNumber);
    }
}
