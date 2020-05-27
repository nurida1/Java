package OfficeHours.Practice_05_13_2020;

public class Statics {
    int instanceVariable = 100;
    static int staticVariable = 200;

    //my static method:
    public static void staticMethod() {
        //instanceMethod(); //cannot be called here
        //System.out.println(instanceVariable); static can only accept static
        System.out.println(staticVariable);
    }

    // instance method:
    public void instanceMethod() {
        staticMethod(); //static method can be called here

        System.out.println(staticVariable); //static variable can be called here

        System.out.println(instanceVariable); //instance variable can be
    }

    //How about my main method? IT IS STATIC ==> ONLY ACCEPTS STATICS

    public static void main(String[] args) {
    //    System.out.println(instanceVariable); //compile error : cannot call instance variable here
        System.out.println(staticVariable);
        staticMethod();
        //instanceMethod(); //compiler error : cannot call instance method here
        //main method(is static) can call instance variables and methods only throught an object. No object created == can not call instances


    }




}
