package day45_Exceptions;

class BreakTimeException extends RuntimeException{ //custom unchecked exception
}

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;

        if (breakTime) {
            throw new BreakTimeException();
        }else {
            System.out.println("Continue the class");
        }
    }
}
