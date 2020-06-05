package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep1() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {  //disadvantage: using several lines
        }
    }


    public static void sleep2() throws InterruptedException { //disadvantage: the color of the method needs to handle, it has to be fixed by someone

        Thread.sleep(3000);

    }

    public static void main(String[] args) throws Exception{ //still throwing Exception, main method if it's called somewhere else, than error will appear again

        System.out.println("Cybertek");
        sleep2();
        System.out.println("Java");

    }

    public static void method1() throws Exception {
        String [] arr = {"A"};
        main(arr);
    }

    public static void method2() {
        try {
            method1();
        }catch (Exception e) {
        }
    }

    public static void method3() {
        method2();
    }


}
