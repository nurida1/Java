package day48_Abstraction;

public interface _9Interface2 {

//  public _9Interface2 () { //u cannot have constructor in interface
// public void method1() {} //instance created from object, object come from class. U cannot have instance in interface
//{ } u cannot have instance block, as there are no instance variables/ U cannot have any blocks in Interface
/*
    static {
        a =300; //u cannot have static block, because u cannot reinitialize static variables because they are final by default
    }
 */
    int a =100; //it's not an instance variable/ variables are static by default

    public static void main(String[] args) {
        System.out.println(a); //by default static
        //a = 200; //by default final

        System.out.println(_9Interface2.a);     //u can call static through interface name
        _9Interface2.method4(); // can call static method through interface name
    }

    public static void method4 () {

    }

    public void method5(); //abstract method by default

    public default void method6() { //default method=> for lambda expressions
        System.out.println("Default method"); //only used for allowing interface to have lambda expressions
    }
}
