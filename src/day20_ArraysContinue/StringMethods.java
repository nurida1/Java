package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
    String name = "Nurida ";
        char[] characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek School".toLowerCase();
        String str2 = "School Cybertek".toLowerCase();

        char [] ch1 = str1.toCharArray(); // [C, y, b, e, r, t, e, k, ,S,c,h,o,o,l]
        char [] ch2 = str2.toCharArray(); // [School Cybertek]

        Arrays.sort(ch1); //[ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        Arrays.sort(ch2); //[ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        boolean equalStr = Arrays.equals(ch1,ch2);
        System.out.println(equalStr); //str1 & str2 are build out of same characters

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));


    }



}
