package day22_Arrays_Loops;
/*
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop and continue
 */

public class Count_odd_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countOddNumbers = 0;
        int countEvenNumbers = 0;

        for (int each : arr) {
            /*
            if (each % 2 != 0) {
                countOddNumbers++;
            } else {
                countEvenNumbers++;
            }
*/

            if (each %2 ==0){ //condition for even numbers
                countEvenNumbers++;
                continue; //to skip next step so its odd numbers--> odd++
            }
            countOddNumbers++; //otherwise count Odd numbers
        }
        System.out.println("even numbers: " +countEvenNumbers);
        System.out.println("odd numbers: "+ countOddNumbers);
    }
}
