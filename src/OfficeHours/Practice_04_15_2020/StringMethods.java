package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
/*
String methods related to Array:
        toCharArray(): returns char array
        split(): splits the string by given str, returns string array
       */

    public static void main(String[] args) {
        String str = "Cybertek";

        char [] ch1 = str.toCharArray(); //['C', 'y', 'b', 'e', 'r', 't', 'e', 'k']

        System.out.println(str.length() == ch1.length); //true does strin'g length equal to char's length? -yes

        /*
        str1 = "abc", str2 = "cab"

         ['a','b', 'c']
         ['c','a', 'b']
after sorting:
         ['a','b', 'c']
         ['a','b', 'c']

         */

        String str1 ="ABC";
        String str2 ="BAC";

        char [] ch3 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch3); //['a','b', 'c']
        Arrays.sort(ch2); //['a','b', 'c']

        System.out.println(Arrays.equals(ch3,ch2));

        System.out.println("===================");

        String sentence = "I like to learn java";

        String [] words = sentence.split(" ");  // returns string array

        System.out.println(Arrays.toString(words));

        int totalWords = words.length;
        System.out.println(totalWords);
        String result = "";

        // [I, like, to, learn, java]
        for (int i = words.length-1; i>=0; i--){
            //System.out.print(words[i] + " ");
             result += words[i] + " ";
        }
        System.out.println(result.trim());
        // java learn to like I

    }
}
