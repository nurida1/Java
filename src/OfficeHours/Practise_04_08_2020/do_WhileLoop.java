package OfficeHours.Practise_04_08_2020;

public class do_WhileLoop {

    public static void main(String[] args) {
        /*
        do{
            statements;

        }while(Condition);

       execution order:
        1.statements;
        2.condition
            if true: repeats step1
            if false: stops the loop

         */

        boolean b = false;

        while(b) {
            System.out.println("Hello World");
  } // in  while loop if false => stetement will never get executed

        do{
            System.out.println("Hello Cybertek");
        }while (b);
        // in do while loop if false ==> statement will be executed at least 1 (once).







    }



}
