package day35_Static;

public class staticMethods {

    int a = 100; //ins var belongs to object
    static int b = 200;

    public static void main(String[] args) { //there is no object instanses
//        System.out.println(a); // static only accepts static

        staticMethods obj = new staticMethods();

        System.out.println( obj.a ); // u can call through object

        System.out.println("=====================================================");

        System.out.println( b );
        System.out.println( staticMethods.b );
        System.out.println( obj.b ); //prefers to be called through class name


    }

    public void method() {
        System.out.println(a);
        System.out.println(b);
    }

}
