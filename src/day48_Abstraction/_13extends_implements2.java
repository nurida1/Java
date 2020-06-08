package day48_Abstraction;

interface P {
    void method1();
}

interface Q extends P {
    int method2();
}

abstract class R {
    abstract void method3();
}

public class _13extends_implements2 extends R implements Q, P { //extends first than implements

    public static void main(String[] args) {
        //R obj = new R(); not concrete
        //Q obj2 = new Q();

    }


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }



}
