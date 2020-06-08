package day48_Abstraction;

public interface _11Interface3 {

    public void method1(); //abstract method -> only ment to be override
    public abstract void method2(); //abstract method

    static final int num = 100; //by default public
    int num2 = 300; //by default: public, static and final


    public static void main(String[] args) { //static method
        _11Interface3.method3();
        System.out.println(num2);
    //in abstract u cannot call num2, because u need to give access modifier

    }

    static void method3() {

    }

    //interface cannot implement class




}
