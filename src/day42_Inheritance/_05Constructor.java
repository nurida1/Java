package day42_Inheritance;

class test  {

    public test() {
        System.out.println("A"); //super class' default constructor
    }

}
public class _05Constructor extends test {

    public _05Constructor () {
        System.out.println( "B"); //sub class' default constructor
}
    public static void main(String[] args) {
        test obj = new test();  //A
        _05Constructor obj2 = new _05Constructor();  //B

    }


}
