package day40_Encapsulation;

public class Quiz {

    public Quiz () {              // constructor w no arg
        System.out.println("A ");
    }

    public Quiz ( int a) {  // A C B  // constructor w int
        this(2.5); //A C
        System.out.println("B ");  //B
    }

    public Quiz (double a) {  //A C // constructor w double
        this (); //A
        System.out.println("C "); // C
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(100);

    }


}
