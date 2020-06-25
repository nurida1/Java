package Practise.LinkedIn;

public class LoopsReview {
    //A loop is control flow statement that allows code to be executed repeatedly based on a boolean condition.

    //While loop
    public static void main(String[] args) {

        System.out.println("While loop");
        int x = 3;
        while(x>0) {
            System.out.println("Current x: " + x);
            x = x-1;
        }
        System.out.println("Final x: " + x);
        System.out.println();

        //While loop
        //Current x: 3
        //Current x: 2
        //Current x: 1
        //Final x: 0

        //Do-while: executes the statement before checking a condition, if that condition is true we execute the statement again, otherwise, we exit the loop.
        System.out.println("Do-While Loop");
        int y = 3;
        do {
            System.out.println("Current y: " + y);
            y = y -1;
        } while (y > 0);
        System.out.println("Final y: " + y);
        System.out.println();

        //Do-While Loop
        //Current y: 3
        //Current y: 2
        //Current y: 1
        //Final y: 0

        //For loop: with this loop we initialize the variable first, check the condition, if the condition is true, we execute a set of statements.
        //after executing the st-t we increment or decrement the variable, check the condition agaon -> false -> exit the loop

        System.out.println("For loop");
        for(int i = 3; i > 0; i--) {
            System.out.println("Current i: "+ i);
        }
        System.out.println();
        //For loop
        //Current i: 3
        //Current i: 2
        //Current i: 1

        //Loops are great for executing repetitive certain tasks


        //java.lang - classes and interface;

    }





}
