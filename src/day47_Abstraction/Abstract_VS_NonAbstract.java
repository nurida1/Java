package day47_Abstraction;

//Regular class:

final class Test1{  //when u apply final you cannot inherit

    public Test1() {}
    public void method1() {}
    public static void method2() {}
    //public abstract void method3(); // in regular class you cannot have abstract method

    int a = 100; //instance
    static int b = 200; //static

    {

    }//instance block

    static{

    }//static block

}




abstract class Test2 { //you can have anything that regular class has + Abstract method
        //even abstract class has constructor
        public Test2() {}
        public void method1() {}
        public static void method2 () {}
        public abstract void method3 ();

        int a = 100;
        static int b = 200;

    {

    }

    static{

    }







}








public class Abstract_VS_NonAbstract {
}
