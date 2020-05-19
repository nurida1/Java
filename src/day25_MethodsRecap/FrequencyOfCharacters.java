package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBCC"; //A2B2C2

        String NonDup = Library.RemoveDuplicates(str); //removing duplicates           //ABC
        String result = "";

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i); //"A" from char ="" to String charAt(o) = "A"
            int num = Library.Frequency(str, ch);  //count frequency
        //    System.out.println(ch + num);
            //the same task at day19
            result += ch + num;

        }

        System.out.println(result);
    }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library.RemoveDuplicates(str); //removing duplicates           //ABC
        String result = ""; //contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i); //"A" from char ="" to String charAt(o) = "A"
            int num = Library.Frequency(str, ch);  //count frequency
            //    System.out.println(ch + num);
            //the same task at day19
            result += ch + num;
        }
        return result;

    }

}



