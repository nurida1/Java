package day20_ArraysContinue;

import java.util.Arrays;

/*
write a program that can combine two arrays of any length, and return the third array
 arr1==> [1,2,3];
 arr2==> [4,5,6,7];

 arr3==> [1,2,3,4,5,6,7];
 */
public class combineArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = new int[arr1.length+arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
