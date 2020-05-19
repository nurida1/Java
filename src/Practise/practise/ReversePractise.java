package Practise.practise;
/*
I will be employed by Apple
 */

public class ReversePractise {

    public static void main(String[] args) {

        String str = "I will be employed by Apple Co";

        int lastIndexnum=str.length()-1;
        String reverse = "";

        for (int i= lastIndexnum; i>=0; i--) {
            reverse += str.charAt(i);
            System.out.println(reverse);

        }

    }


}
