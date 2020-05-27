package OfficeHours.Practice_05_20_2020;

class Data{
    int a = 100;

    public void method () {
        System.out.println("Hello World");
    }
}


public class _04SuperKeyword extends  Data{
    int a = 200;

    public void method () {
        System.out.println("hello Cybertek");
    }

    public _04SuperKeyword () {
        //method(); //hello Cybertek
        super.method(); //"Hello World
        System.out.println(super.a); //to call instance variable from parent class //100
        //System.out.println(a); 200

    }

    public static void main(String[] args) {
        _04SuperKeyword obj = new _04SuperKeyword();
    }


}
