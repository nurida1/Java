package day43_MethodOverriding;

class Test {

    public void method () {
        System.out.println("Onur");
    }


}




public class _3MethodOverriding extends Test{

    @Override
    public void method() {              //return type must be the same
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
             obj1.method();     // Onur

        _3MethodOverriding obj2 = new _3MethodOverriding();
        obj2.method();          // Zarina



    }

}
