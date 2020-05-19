package day21_MultiDimensionalArrays;
/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */


import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");

        int[]arr = {10,20,30,40,50,60,70,50,40,25};  //or double instead of int
        // average: sum of all numbers / length

        int length = arr.length; //total number of elements    //length is always int
        int sum = 0;                                         //or double instead of int

        for(int i=0; i<length; i++){
            int eachNum= arr[i];
            sum +=eachNum;
        }
        System.out.println(sum);

        double average = sum/length; //cast to double to return exact number with decimals EXPLICIT
//        System.out.println(sum/length);
        System.out.println(DF.format(average));


        /*
        [2,1,3] ==> 6
        [1,2,3] ==> 6

        int [] arr2 = {1,2,2}; //5/3 =1

        System.out.println(5/3);
        System.out.println(5/(double)3);

*/


    }

}
