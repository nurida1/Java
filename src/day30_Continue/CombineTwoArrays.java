package day30_Continue;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
   4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}


     */

    public static void main(String[] args) {


        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D","E", "F", "G", "H","I"};

        ArrayList<String> list = new ArrayList<>(); // {"A", "B", "C", "D","E", "F", "G"}

        for (int i =0; i < arr1.length; i++ ) {
            String eachElement = arr1[i];
            list.add(eachElement); // or list.add(arr1[i]) doesn't matter

        }

        for (String eachElement : arr2){
            list.add(eachElement);
        }
        System.out.println(list);


    }



}
