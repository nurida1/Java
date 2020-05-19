package Practise.day22;

public class Nested_ForEach {
    public static void main(String[] args) {


        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };
        // 1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd number
        // 3. add sum of even and odd

        int countOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int [] each1DArray: numbers) {
            for (int eachElement : each1DArray) {
                if (eachElement%2 ==0) {
                sumEven+=eachElement;
                    System.out.print(eachElement + " ");

                }else {
                    countOdd++;
                    sumOdd+=eachElement;
                }

            }
        }
        System.out.println();
        System.out.println(countOdd);
        System.out.println("sum of even "+ sumEven);
        System.out.println("sum of odd "+ sumOdd);
    }
}

