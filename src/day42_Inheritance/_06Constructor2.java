package day42_Inheritance;


class Test {

    public Test (int a) { //constructor with int argument
        this(2.5);      //C
        System.out.println("A");
    }

    public Test (double a) {
        System.out.println("C");

    }
}

public class _06Constructor2 extends Test { //when parent's class constructor is default, then ic can called automatically


    public _06Constructor2() {
        //this(10); //we dont' have construtor with int argument
        //super(10); //refers to the object instance of the super class, used for calling constructor from super class
        //super(15.5); //C one constructor cannot call more than one
        super (10); //  C  A
        System.out.println("B"); //C A B
    }

    public static void main (String [] args) {

        Test obj = new Test(10); // C A

        //_06Constructor2 obj2 = new _06Constructor2();
    }

}
