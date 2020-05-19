package day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {
        int number = 100;
        if (number %2 ==0) // for this only  1 sout belongs if without {
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        if (9<8) { // if the block containing more than 1 statement we must give the body
            System.out.println("Hello");

            System.out.println("Condition is true");
            System.out.println("Test executed");
        }
    }
}
