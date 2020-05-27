package OfficeHours.Practice_04_22_2020;

public class return_Statement {

    public static void main (String [] args) {
/*
        if (10> 9) {
            return;
        }

        System.out.println("Hello Batch 18");
  */

        method1();
        System.out.println("Hello Batch 18"); //it will be printed

    }
        public static void method1 () {
            if (10 > 9) {
//            return;
//        System.exit(0);


            }
            System.out.println("Hello Cybertek"); //it will not be printed

        }
            public static void method2 () {
                return; // exits only
            }

            public static int method3 () {
                return 123; // exits after returning value
            }




        }


