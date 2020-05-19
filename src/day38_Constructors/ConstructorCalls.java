package day38_Constructors;

import day37_Constructors.ConstructorIntro;
/*
    Rules:
    1. only constructor can call another constructor
    2. In order to call a constructor in another constructor ==> must use this() keyword (this() is used to call constructors)
        this() can only be used in a constructor calling another constructor. (DO NOT USE NAME OF CONSTRUCTOR)
     */

public class ConstructorCalls {

    //first constructor method:
    public ConstructorCalls() {
        method1();
        method2();
    }

    //second constractor call:
    public ConstructorCalls(int a) {
        this();
    }
    //because we didn't pass any parameter ==> we are calling the first constructor

    public static void method1 () {

    }

    public static void method2 () {
    }
}