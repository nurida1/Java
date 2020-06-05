package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(400));

        }catch (RuntimeException e){ //or Exception
                String description = e.getMessage();
                System.out.println(description); //String index out of range: 400

        }

        System.out.println("====================================");
        String result = "";

        try {
            System.out.println( 100 / 0);
            System.out.println("Try block");

        }catch (ArithmeticException e) {
            System.out.println("Catch block");
           result = e.getMessage();
        }

        System.out.println(result);
        System.out.println("Completed");


    }

    /*
    testCase:
        step1
        step2
        step3
        step4
        ...
        step10
     */










}
