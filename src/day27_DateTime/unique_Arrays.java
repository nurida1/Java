package day27_DateTime;
/*
 3. write a method that can print out the unique elements from an int array
                 Ex: {1,1,2,3,3} ==> 2
                     {6,6,7,7,8,9} ==> 8 9
     4. write a method that can print out the unique elements from a double array
                 Note: Apply method overloading

  */
public class unique_Arrays {
    public static void main(String[] args) {
     // step2 = paste to main method and check. regular loop
        int [] arr = {1, 1, 2, 3, 3}; //2
        //            0  1  2  3  4

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for(int each : arr) {
                if (each == arr[i]) {  //each2 to check arr[0, 1, 2, 3, 4] at each index
                    count ++;
                }
            }
            if (count ==1){
                System.out.println(arr[i]);
            }
            System.out.println("======================");
            int [] arr2 = {3,3,4,4,5,5,6,7,8,9};
            uniqueElements(arr2);

            System.out.println("======================");

            double [] arr3 = {1.5,1.5,2.5,3.5, 3.5, 4.5};
            uniqueElements(arr3);


        }

        // step1: explanation of above: we can delete it
        //arr[0] - to compare with every single index ==>1
        int count = 0;
        for(int each : arr) {

            if (each == arr[0]) {  //arr[0]to check arr[0, 1, 2, 3, 4] at each index
                count ++;
            }

           }
            if (count ==1){
                System.out.println(arr[2]);
            }

    }

    //step3: placed to method. for each loop is better
    public static void uniqueElements(int [] arr) {  // we just want to print it out
        for (int each2 : arr) {

            int count = 0;
            for (int each : arr) {
                if (each == each2) {  //each2 to check arr[0, 1, 2, 3, 4] at each index
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }

    public static void uniqueElements(double[]arr) {
        for (double each2 : arr) {

            int count = 0;
            for (double each : arr) {
                if (each == each2) {  //each2 to check arr[0, 1, 2, 3, 4] at each index
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);


            }

        }
    }





}
