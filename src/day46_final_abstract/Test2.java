package day46_final_abstract;

import java.io.IOException;

public class Test2 {

    static int a = 50;
    public static void main(String[] args) throws RuntimeException {

        a = 100;

        try {
            a = 200;
        } catch (Exception e) {
            a = 300;
        } finally {
            a = 400;
        }
        System.out.println(a);

    }
     static {
        a = 500;









//        String [] names = {"Barzy", "Ozgur", "Deniz"};
//        String name1 = names[names.length + 1];
//
//        System.out.println();
//
//        System.out.println("==================");
//
//        try {
//            throw new ArithmeticException();
//        }catch (RuntimeException e) {
//            System.out.println("Runtime");
//        }catch (ArithmeticException e) {
//            System.out.println("Arithmetic");


        }








}
