package day22_Arrays_Loops;

public class NestedLoops {

    public static void main(String[] args) {
        //       elements:     0    1      0    1    2      0    1    2    3
        char [] [] arr2D = { {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'} }; // each index in arr2D MUST be single dimensional array
        //                        0             1                2
        //each index in arr2D MUST be single dimensional array

        //arr2D[0] ==> {'A', 'B'}
        /*    j  i
        arr2D[0][0]
        arr2D[0][1]

        arr2D[1][0]
        arr2D[1][1]
        arr2D[1][2]

        arr2D[2][0]
        arr2D[2][1]
        arr2D[2][2]
        arr2D[2][3]

         */

        for (int i =0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0] [i]);
        }

        // arr2D[1] == > {'C', 'D', "E}
        for (int i =0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i] );
        }

        // arr2D[2] ==> {'F', 'G', 'H', 'I'}
            for (int i =0; i < arr2D[2].length; i++) {
                System.out.println(arr2D[2] [i]);

        }
        System.out.println("=======================");

    for (int j =0; j < arr2D.length; j++) { //Nested loop, outer loop j: index numbers of 1D array   i: index number of elements in 1D array

        for (int i =0; i < arr2D[j].length; i++) { //inner loop  arr2D[0], arr2D[1], arr2D[2]
            System.out.println(arr2D[j] [i]);
        }


    }

    }


}
