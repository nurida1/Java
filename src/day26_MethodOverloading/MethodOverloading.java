package day26_MethodOverloading;

public class MethodOverloading {
    // "Overloaded method - same name, multiple methods, different parameters

    public static void main(String[] args) {

        method(10);// "Original method
        method(10.0); // "Overloaded method

    }


    public static void method (int a) {
        System.out.println("Original method");
    }

    public static void method (double a) {  // or int a, int b
        System.out.println("Overloaded method");  //different

    }




}
