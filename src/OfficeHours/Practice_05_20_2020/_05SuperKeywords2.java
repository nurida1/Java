package OfficeHours.Practice_05_20_2020;

class TestData {
    int num = 1000;
    String name = "Cybertek";

    public void method () {
        System.out.println("Cybertek");
    }

}

public class _05SuperKeywords2 extends TestData{

    int num = 200;
    String name = "MIT";

    public void method () {
        System.out.println("MIT School");
    }

    public _05SuperKeywords2 () {
        //method(); MIT
    super.method(); //Cybertek
        System.out.println( this.num ); //200 calls local variable
        System.out.println( super.name ); //100  calls variable from super class
    }

    public static void main(String[] args) {
        _05SuperKeywords2 obj = new _05SuperKeywords2 ();
    }






}
