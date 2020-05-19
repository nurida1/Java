package Practise.day26;
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged,
one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"

 */
public class MethodsWithString_Merge {

    public static void main(String[] args) {

        String s1 = "12345";
        String s2 = "abcde";

        System.out.println(mergeStrings("12345","abcde"));
    }



    public static String mergeStrings (String str1, String str2) {

      String result = "";

      int length = 0;

      length = (str1.length() > str2.length() ) ? str1.length() : str2.length();

      for (int i =0; i < length; i++) {
          if (i < str1.length()) {
              result += str1.charAt(i);
          }
          if (i < str2.length()) {
              result += str2.charAt(i);
          }
      }

      return result;
    }
}
