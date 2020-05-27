package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practise {

    /*

    while (Condition){
            statements
    }
        repeated if statement
        execution order:
        1.condition
        2.

     */

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World"); // be printed 5 times
        }
        System.out.println("============");

        int z = 0;
        while (z<5) {
            z++; //1,2,3,4,5
            System.out.println("Hello Cybertek"+z);
       // z++; 01234
        }
        System.out.println("=============");

        int j = 0;
        while ( j <= 100) {
            if ( j %15 ==0) {
                System.out.print(j+" ");
            }
            j++;
        }







    }
}
