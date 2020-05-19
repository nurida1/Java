package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) { //return exits only this main method

        /*
        if ( 10> 9) {
        return; // exits the current method only
        }

        System.out.println("Hello");
        */

        method1(); //it will not print anything, it is only exits method1, not main method
        System.out.println("Hello"); // it will be printed

        method2(); //it will not print anything
        System.out.println("Hello"); // it will not be printed due to exit from the whole system

    }
    //Return st-t: exits current method only
    public static void method1() {

        if (10 > 9) {
            return; //to exit the current method1 only, but u cannot return value from void method ,
        }

        System.out.println("Hello Cybertek"); //it will not be printed due to return

    }

    // System.exit: exits entire system
    public static void method2 () {
        if (10 > 9) {
            System.exit(0);
        }

        System.out.println("Hello Cybertek"); // it will not be printed due to exit


    }



}
