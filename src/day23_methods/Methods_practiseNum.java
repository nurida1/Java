package day23_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_practiseNum {
    /*
    4. creata a function that can print the maximum number from any given array. use scanner, max=6 numbers
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int [] num = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            MaxNum(num);
            MinNum(num);
            DescNum(num);
        }

    public static void MaxNum (int num[]) {
        int max =-999999999;
            for (int i= 0; i < num.length; i++) {
                if (num [i] > max) {
                    max = num [i];
                }
        }
        System.out.println("Maximum number is: "+max);
    }

    public static void MinNum (int num []) {
        int min = 999999999;

        for (int i =0; i < num.length; i++) {
            if (num [i] < min){
                min = num[i];
            }
        }
        System.out.println("Minimum number is: "+min);
    }

    public static void DescNum (int num []) {

        Arrays.sort(num);
        int [] Rev = new int [num.length];
        int j = num.length-1;

        for (int i =0; i<= num.length-1; i++){
        Rev [i] = num[j];
        j--;
        }
        System.out.println(Arrays.toString(Rev));
    }
}
