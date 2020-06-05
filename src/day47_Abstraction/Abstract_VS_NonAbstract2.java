package day47_Abstraction;

abstract class A {
    public abstract void method1 ();
    public void method2() {};
}


public class Abstract_VS_NonAbstract2 extends A { //MANDATORY to override the abstract method
    @Override
    public void method1 () {
        //here 2 methods
    }

}

abstract class B extends A{ //optional to override the abstract method of A
    //here 2 methods:one abstract and one instance
}

 class C extends B{ // method1

    public void method1(){

    }


}