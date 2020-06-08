package day48_Abstraction;

interface I1 {  //1 abstract method
    void method1();
}

interface I2 extends I1{ //2 abstract methods
    void method2();
}


//abstract class AC extends _12extends_implements{
abstract class AC implements I2 {    //3 abstract method
   abstract void method3(); //give abstract keyword to create in abstract class
}


public abstract class  _12extends_implements extends AC{  //3 abstract method

    @Override
    public void method2() { //not an abstract method
    }

    //2 abstract methods left: method1 & method3

//    @Override
//    public void method2 () {
//
//    }
//    @Override
//    public void method1 () {
//
//    }

}

class testRun extends _12extends_implements{

    @Override
    public void method1 () { //abstract method

    }

    @Override
    public void method3 () { //abstract method

    }

}
