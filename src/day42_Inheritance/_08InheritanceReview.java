package day42_Inheritance;

class B {
    public B (int a) {
        System.out.println("int");
    }

    public B (double b) {
        System.out.println("double");
    }

    public B (long a) {
        System.out.println("long");
    }
}

public class _08InheritanceReview extends B { //must be called in subclass

    public _08InheritanceReview (String a) {
        super(19l); //int
        System.out.println("String"); //string
    }

    public static void main(String[] args) {
        _08InheritanceReview obj = new _08InheritanceReview("Hello");


    }

}
