package Resources;
/*

 */

import day42_Inheritance._03Data;

public class Inheritance extends _03Data {
    //          sub                 super

    public static void main(String[] args) {
        System.out.println( Inheritance.publicData); //can be called through class name
        System.out.println( Inheritance.protectedData );
        // System.out.println( Inheritance.defaulData ); //default is not visible outside the package
        // System.out.println( Inheritance.privateData ); //private is not visible outside the package



    }





}
