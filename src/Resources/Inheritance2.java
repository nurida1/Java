package Resources;

import day42_Inheritance._04Accessmodifiers;

public class Inheritance2 extends _04Accessmodifiers {
//              sub                   super

    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod
     */

    public static void main(String[] args) {
        System.out.println( Inheritance2.publicVariable );
        System.out.println( Inheritance2.protectedVariable );
        //System.out.println( Inheritance2.defaultVariable );

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
        //Inheritance2.defaultMethod();  not inherited



    }


}
