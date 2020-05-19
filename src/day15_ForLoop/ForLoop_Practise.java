package day15_ForLoop;

public class ForLoop_Practise {
    public static void main(String[] args) {
        /*
        odd numbers between 0 ~100 in a single line separated by a space
                            1 3 5 7 9 11 ..
         */
        String resultOdd = "";

        for(int number = 1; number<=100; number += 2) {
        //    System.out.print(number+" ");
          //  result += number +" ";
            resultOdd = resultOdd+number+" ";
        }
        System.out.print(resultOdd);

        System.out.print("========================");
        /*
            Even number between 1 ~ 100
                     2 4 6 8 10
        */

        String resultEven = "";
        for (int number =0; number <=100;number +=2) {
            resultEven += number + " ";
            System.out.print(resultEven);

        }

    }
}