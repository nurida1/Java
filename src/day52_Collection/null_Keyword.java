package day52_Collection;

import java.util.ArrayList;

public class null_Keyword {

    static String str = new String( "Cybertek"); // ==null

    static ArrayList<Integer> list1 = new ArrayList<>();
        //reference type - class - non primitive - gives null

    public static void main(String[] args) {

        System.out.println( str.charAt(0) );
       // System.out.println( list1.get(1) );
        //reference types - all the non primitives

        // for all reference type you can assign null to them
        //WebElement element = null;
        String str2 = null;
        Integer i1 = null;
        //int num =null you cannot, 0.

        ArrayList<String> list2 = new ArrayList<>();
        list2.add(null);

        System.out.println(list1);

    }


}
