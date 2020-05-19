package day22_Arrays_Loops;

import java.util.Arrays;

/*
   Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement

 */
public class EvenNumbers {
    public static void main(String[] args) {

        int [] numbers = new int [200]; //index: 0 ~ 99
/*
        numbers [0] =1;
        numbers [1] =2;
        ...
        numbers [2] =3;
    */

        for (int i =0; i < numbers.length; i++) { //or i<100
            numbers[i] = i+1;


        }
        System.out.println(Arrays.toString(numbers));

        for ( int each : numbers ) { //each represents each element in array
            if (each%2 != 0){ //to skip odd numbers
                continue;

            }
            System.out.println(each + " ");

        }


    }

}
