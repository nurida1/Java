package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {

        System.out.println("Test started");

        //System.out.println( 9/0 );

        String str = "Cybertek";

        //System.out.println( str.charAt(-1) );

        int [] arr = {1,2,3};
        System.out.println( arr[200] ); //unchecked exception-occurs during runtime, not during writing the code

        System.out.println("Test completed");


    }



}
