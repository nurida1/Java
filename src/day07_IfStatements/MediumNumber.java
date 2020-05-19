package day07_IfStatements;
/*

 */

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

    /*
    a: if (a < b && a > c) or if (a > b && a < c);
    b: if (b < c && b > a) or if (b > c && b < a);
    c: if (c < b && c > a) or if (c > b && c < a);

     */

    //x, y, z

        boolean aMedium = (a < b && a > c) || (a > b && a < c);
        //b<a<c or c<a<b
        //b>a>c or c>a>b

        boolean bMedium = (b < c && b > a) || (b > c && b < a);
                          // c < b < a or a < b < c

        boolean cMedium = (c < b && c > a) || (c > b && c < a);
                         // a < c < b or b < c < a

        if (aMedium) {
            System.out.println(a+" is a medium number");
        }
        if (bMedium) {
            System.out.println(b+" is a medium number");
        }
        if (cMedium) {
            System.out.println(c+" is a medium number");
        }














    }


}
