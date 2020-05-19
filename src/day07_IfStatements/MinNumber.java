package day07_IfStatements;
/*3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */

public class MinNumber {
    public static void main(String[] args) {
        double a = 10000.5;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c; //if a< both b &c, than a==> min
        boolean bMin = b < a && b < c; //if b< both a &c, than b==> min
        boolean cMin = c < a && c < b; //if c< both b &a, than c==> min

        if (aMin) {
            System.out.println(a+" is a minimum number");
        }
        if (bMin) {
            System.out.println(b+" is a minimum number");
        }
        if (cMin) {
            System.out.println(c+" is a minimum number");
        }













    }


}
