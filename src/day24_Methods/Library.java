package day24_Methods;

import java.util.Arrays;

public class Library {

    public static int [] sortDescending(int [] arr) {  //void doesn't return any value, if array then arr[]
        Arrays.sort(arr); // {1, 2, 3, 4} ==> {4, 3, 2, 1};
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;

        }

        return RevArr; //returns a value, value u can assign to varrible

    }

    public static String Reverse(String str) {
        String Reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }

}
