package day37_Constructors;

//import java.util.Arrays; // only imports Arrays class from java util

import java.util.*; //imports all the classes from java util

//import static day37_Constructors.Data.staticVariable; //import static variable or
//import static day37_Constructors.Data.staticMethod;  //import static method

import static day37_Constructors.Data.*; //imports all static

public class ImportStatement {

    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        Arrays.sort(arr);

        System.out.println( staticVariable );

        staticMethod();


    }


}
