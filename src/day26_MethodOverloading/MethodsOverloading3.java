package day26_MethodOverloading;
/*
    first method:  can find sum of two int numbers
    second method: can find the sum of two double numbers

     */

public class MethodsOverloading3 {

    public static void main(String[] args) {

        sum (10,20); //30
        sum (1.5, 2.5); //4.0

        //10, 15.5
        double num1 = sum(10, 15.5); // u can't assign double to int. u can assign int to double. bellow second method will be executed
        System.out.println(num1);

        //25L, 30L
        double num2 = sum(25L, 30L); //can't assign long to int, can assign to double
        System.out.println(num2);

        //5, 4
         //double num3 = sum(5,4); // void method does not return any value

        //40L, 50L

        sum((int)40L, (int)50L); //explicit casting from long to int forcefully. returns int but u cannot use value due to void



    }
    //Method overloading:
    public static void sum (int a, int b) {
        System.out.println(a+b);
    }

    public static double sum (double a, double b) { // in method overloading, return type doesn't matter
        return (a+b);
    }



}
