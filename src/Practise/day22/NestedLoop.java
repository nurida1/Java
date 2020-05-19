package Practise.day22;

public class NestedLoop {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number

        int countOdd = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int k = 0; k < numbers[i].length; k++) {
                int num =numbers[i] [k];
                if (num  % 2 == 0) {

                    System.out.print(num + " ");
                }else  {
                    countOdd++;
                }
            }

        }
        System.out.println();
        System.out.println(countOdd);
    }
}
