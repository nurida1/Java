package day38_Constructors;

public class ConstructorPractice {

    //1st Constructor:
    public ConstructorPractice( ) {
        this(10.0);
        System.out.println("A");
    }

    //2nd Constructor:
    public ConstructorPractice ( int a ) {
        this(); // this is calling default constructor 1st constructor (no parameter)
        //this(10.5); //rule #4 calling another constructor only once
        System.out.println("B");
    }

    //3rd Constructor:
    public ConstructorPractice ( double a ) {
        //this(); rule #5
        //this(5.5); rule #5
        //this(10); //rule #5
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorPractice(10); //C, A, B
    }



}
