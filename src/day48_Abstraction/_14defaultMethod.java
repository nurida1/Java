package day48_Abstraction;

abstract class T {
    //public default void method2() { //default meant to be created in interface only }

    }

public interface _14defaultMethod {

    default void method() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        //method();
        //defaultMethod obj = new defaultMethod();
    }

    class N implements _14defaultMethod {
        public static void main(String[] args) {
            N obj = new N();
            obj.method();

        }
    }



}
