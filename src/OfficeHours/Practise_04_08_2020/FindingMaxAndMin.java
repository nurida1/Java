package OfficeHours.Practise_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int max = -2147483648; //10,20-is max
        int min = 214748367;  // assume that min number is less than this number //10, 5 is min

        int i = 1;
        while (i <= 3) {

            System.out.println("Enter a number");
            int num = input.nextInt();  //10,20,5

            if (num > max) {
                max = num;
            }
            if(num<min) { //whichever user input is smaller, will be assigned to min
                min = num;
            }
                i++;

        }

        System.out.println("maximum number is " +max);
        System.out.println("minimun number is " +min);
    }


}
