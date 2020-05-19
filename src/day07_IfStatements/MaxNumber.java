package day07_IfStatements;
/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)

 */

public class MaxNumber {
    public static void main(String[] args) {
        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a > c; // if a is a greater than both b and  c, then a is a max

        boolean bGreater = b > a && b > c; //if b is a greater than both b and  c, then b is a max
        //    boolean bGreater2 = b>a || b>c ; //if b is greater then either a and c, then b is maximum . || is wrong

        boolean cGreater = c > a && c > b; // if c is greater then both a and b, then c is max

        if (aGreater) {
            System.out.println(a + " is greater number");
        }

        if (bGreater) {
            System.out.println(b + " is greater number");
        }
        if (cGreater) {
            System.out.println(c + " is greater number");


        }


    }
}