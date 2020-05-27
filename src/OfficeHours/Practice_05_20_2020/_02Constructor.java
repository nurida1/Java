package OfficeHours.Practice_05_20_2020;

class Test {
    public Test(int a) {
        System.out.println("A");
    }
}


public class _02Constructor extends Test{

    public _02Constructor () { //AB
        super(10); ///needs to be before print statement
        System.out.println("B");
    }
//If parent constructor is not default, you Must be called manually

    public static void main(String[] args) {
        _02Constructor obj = new _02Constructor();

    }

}
