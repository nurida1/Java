package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practise {

    public static void main(String[] args) {
        /*
        nested loop: loop inside another loop
                     inner loop & outer loop
         nested loop: we only need them when we need to repeat a loop

         outer loop repeats the inner loop
         */
/*
        for(int i = 10; i <= 50; i+= 10) {
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 10; i <= 50; i+= 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 10; i <= 50; i+= 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 10; i <= 50; i+= 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 10; i <= 50; i+= 10) {
            System.out.print(i + " ");

        }
        System.out.println();

 */
        int j = 1;
        while (j < 6) { // to execute 5 times

            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();

            j++;
        }

        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        for (int l = 1; l <= 15; l++) { //or l=1; l<=8; l++
            for (int k = 0; k <= 20; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===================================");

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * */

        //TRIANGLE
        for (int i = 1; i < 8; i++) { //to execute 7 times

            for (int l = 0; l < i; l++) { //or l=1; l<=8; l++
                System.out.print("* ");
            }
            System.out.println();


        }
        // REVERSED TRIANGLE:
        for (int i = 8; i > 0; i--) { //to execute 7 times

            for (int l = 0; l < i; l++) { //or l=1; l<=8; l++
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}