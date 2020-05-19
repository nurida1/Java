package Practise.day24;

public class Practise_return {

    public static void main(String[] args) {

        System.out.println(max(10, 5));


        System.out.println("==========");














    }

    public static int max(int x, int y) {

        int max = (x > y) ? y : x;

        return max;
    }



    public static boolean isEven(int n){

        boolean result = (n % 2 ==0) ? true : false;

        return result;
    }
}


