package day26_MethodOverloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodOverloading2 {

    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: print the sum of four int numbers
     */

    public static void main(String[] args) {
        //10, 5
        sum2numbers(10, 5);

        // 10, 5, 15
        sum3Numbers(10, 5, 15);

        //10, 20, 30, 5
        sum4Numbers(10, 20, 30, 5);

   //     double[] arr = {5, 4, 7, 1, 2};
     //   Arrays.sort(arr);


//PRINT METHOD OVERLOADING:
        System.out.println("==================");

        //10, 5,
        sum(10,5);

        //10, 15, 5
        sum(10,15,5);

        //10, 20, 30, 5
        sum(10,20,30,5);


        int [] arr1 = {3, 2, 1};  //int array

        char [] arr2 = {'z', 's', 'a'};  //char array

        double [] arr3 = {7, 4, 6, 5, 20.6};  //double array

        Arrays.sort(arr1); //ARRAYS is overloaded
        Arrays.sort(arr2);
        Arrays.sort(arr3);  //same method name, different parameter

    }


    public static void sum2numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);

        System.out.println("==========================");
    }

//METHOD OVERLOADING:
    public static void sum (int a, int b) {
        System.out.println(a + b);

    }

    public static void sum (int a, int b, int c) { //or double a ...
        System.out.println( a+b+c);

    }
    public static void sum (int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }

}
