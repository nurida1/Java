package day45_Exceptions;

public class warmUp {

    public static void main(String[] args) {

        int pushups = 1;
        while (pushups < 21) {
            System.out.println("Pushups "+ (pushups)); //or pushups+1

            try {
                Thread.sleep(300);
            } catch (Exception e) { }
                pushups++;
        }
    }
}
