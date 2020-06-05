package day46_final_abstract;

public class final_Practices {

    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
        //a = 20; //cannot be reassigned
    }

    static {
        System.out.println(b);
        //b = 30;
    }

    public final_Practices() { }

     final void method1() {

    }

    public final static void method2() {
    }

    public void method1(int a) {

    }

}

final class test extends final_Practices{
    /*
    @Override
    protected void method1() {
    }

     */

}

final class test2 extends final_Practices{


    //parent class cannot be final
    //child can be final
}
