package day05_Unary_ShorthandOperators;

public class VariablesPractice {
    public static void main(String[] args) {
        //Whole numbers: byte, short, int, long
        //Decimals: float, double
    int a1 =100;
    float f1 = (long) a1;
         //f1=100L;
        //f1 =100.0; as float is for decimals

        System.out.println(f1);

        // long l1 =f1;  float is too large for long

        long l1 =(long)f1;
        //l1=100

        System.out.println(l1);

        String name;

        name = "Cybertek"; //in Java: first come first serve
        System.out.println(name); //local variables cannot be used w/o initializing


        System.out.println(name);





    }

}
