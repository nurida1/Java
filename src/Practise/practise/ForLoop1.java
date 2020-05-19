package Practise.practise;
/*
       odd numbers between 0 ~100 in a single line separated by a space
                           1 3 5 7 9 11 ..
        */
public class ForLoop1 {
    public static void main(String[] args) {

        String resultOdd= "";

        for(int number =1; number <= 100; number +=2) {
            resultOdd = resultOdd + number + " ";
        }
        System.out.print(resultOdd);

        System.out.print("====");

        String resultEven = " ";

        for (int number  = 0; number <= 100; number+=2 ) {
            resultEven = resultEven + number + " ";
        }
        System.out.print(resultEven);



    }



}
