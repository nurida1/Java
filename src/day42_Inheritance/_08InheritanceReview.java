package day42_Inheritance;

class B {
    public B (int a) {
        System.out.println("int");
    }

    public B (double b) {
        System.out.println("double");
    }

    public B (long a) {
        this(4.5); //double
        //this(10); one constructor can only call one constructor
        System.out.println("long"); //long
        //this(4.5); //this should be in the beginning before sout
    }
}

public class _08InheritanceReview extends B { //must be called in subclass

    public _08InheritanceReview (String a) {
        super(19l); //double long
        System.out.println("String"); //string
    }

    public static void main(String[] args) {
        _08InheritanceReview obj = new _08InheritanceReview("Hello");


    }

}
