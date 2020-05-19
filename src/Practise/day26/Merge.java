package Practise.day26;

public class Merge {

    public static void main(String[] args) {

        String str1 = "abcdeef";
        String str2 = "123456";



    }

    public static String mergeStrings (String str1, String str2) {

        String result = "";

        int length = (str1.length() > str2.length() ? str1.length() : str2.length());

        for (int i =0; i < length; i++ ) {
            if (i < str1.length()) {
                result += str1.charAt(i); // charAt - returns character in every index
            }
            if (i < str2.length()) {
                result += str2.charAt(i);
            }
        }
        return result;
    }
}
