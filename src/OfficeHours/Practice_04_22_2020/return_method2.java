package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_method2 {
    // write a return method that can return the second maximum number from an int array


    public static void main(String[] args) {

        //1st EXAMPLE:
        int [] arr = {100, 40, 500, 50, 30, 100, -5, -100};

        Arrays.sort(arr);
        //        System.out.println(arr[arr.length-2]); //shortcut

        System.out.println(Arrays.toString(arr)); //[-100, -5, 30, 40, 50, 100, 100, 500]

        int lastIndexNum = arr.length-1;

        int secondLastIndexNum = lastIndexNum-1;  //arr.length -2
            //                   arr.length-1-1=arr.length -2

        int secondMaximum = arr [secondLastIndexNum];

        System.out.println(secondMaximum);

        // 2nd EXAMPLE:
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};

          int num2 = secondMax(arr2);

        System.out.println(num2);
    }

    public static int secondMax (int [] arr) {

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[-100, -5, 30, 40, 50, 100, 100, 500]

        int lastIndexNum = arr.length-1;

        int secondLastIndexNum = lastIndexNum-1;

        int secondMaximum = arr [secondLastIndexNum];


        return secondMaximum;
    }
}
