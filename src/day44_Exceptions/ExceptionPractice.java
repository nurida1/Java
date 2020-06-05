package day44_Exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {

        try { //u can place many st-ts as u want, as soon as exception occurs, it wil jump to catch right away
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println( 9 / 0 );
            System.out.println("Cybertek");
            System.out.println("Java");

        }catch (Exception e) { //Hello, Hola

        }
            System.out.println("Cybertek");
        System.out.println("Java");
    }
    }

