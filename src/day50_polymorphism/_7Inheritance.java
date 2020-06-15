package day50_polymorphism;

import Resources.Inheritance;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class _7Inheritance { //building IS A relation // build super and sub classes //easiest way to get rich

    //super class

    //sub class: can inherit visible variables and visible methods (except constructor) from super class

    //in polymorphism: super class can get reference to child methods
    //extends keyword
    //method overriding - MUST happen in sub class
    //polymorphism
    /*
        advantage:
        less code,
        reusable - utility class
        easy to maintain - if u put in utility class, u can change code easily from utility class (not 100 times if u have 100 classes)
     */
    //public and protected - always visible to subclasses

    public int publicInt = 100;
    protected int protectedInt = 200;
    int defaultInt = 300;
    private int privateInt = 400;

}

class Data extends _7Inheritance {

    public static void main(String[] args) {
        Data obj = new Data();
        System.out.println( obj.publicInt );
        //System.out.println( obj.privateInt ); //private is not inherited
        System.out.println( obj.protectedInt );

    }


}
