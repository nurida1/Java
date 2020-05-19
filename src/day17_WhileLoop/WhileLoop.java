package day17_WhileLoop;

public class WhileLoop {

    public static void main(String[] args) {
/*
        while (10>9) {
            System.out.println("Hello World");
}

 */
        for (int i = 0; i <= 5; i++) {
            //int; condition; iterator
            System.out.println(i);
        }

        System.out.println("================================");

        int i = 0;
        while (i <= 5) {
          //  i++; starts from 1 if we put before print statement
            System.out.println(i);
            i++; //we place it at the end because
        }

        System.out.println("=====================================");

        while(true) { // continiously executed
        System.out.println("Hello World");

    }

    }
}