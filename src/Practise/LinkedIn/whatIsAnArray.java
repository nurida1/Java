package Practise.LinkedIn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class whatIsAnArray {
    //A container that stores a sequence of values of the same type
    //Example: Integer array {1,2,3}
    //Example: String array {"Hi", "Hello", "Hey"}

    //we wanna store numbers and get an access to numbers

    public static void main(String[] args) {
        //31, 45, 22, 98, 10

        int [] numbers = new int [5]; //size =5. once u declared, u cannot change size or modify it

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int [] numbers2 = {31, 45, 22, 98, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //to print number of arrays

        String [] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: " + myFavoriteCandyBars.length); //3

        System.out.println( Array.get(myFavoriteCandyBars, 2) ); //Butterfinger




    }
}
