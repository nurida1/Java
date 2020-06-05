package day44_Exceptions;

public class Practice3 {

    public static void main(String[] args) {

        System.out.println("Hello");
        waits(5);
        System.out.println("Cybertek");
    }


    public static void   waits(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000)); //5000 milliseconds
        }catch (Exception e) {

        }

    }

}
