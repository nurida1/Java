package day42_Inheritance;

class A { //parent class

    int a = 100;

    public A (double b) {
        System.out.println(this.a); //100
    }

}

public class _07SuperKeyword extends A { //sub class
    int a = 200;
    public _07SuperKeyword() {
        super(3.0);   //100
        System.out.println( super.a ); //100
    }

    /* cannot do it: only constructor can call constructor
    public void method() {
        super(10.5);
    }     */

    public static void main(String[] args) {
        //_07SuperKeyword obj = new _07SuperKeyword();

        A obj2 = new A (5.5 );

    }
}
