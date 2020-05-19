package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    //SORT DESCENDING
    public static int[] sortDescending(int[] arr) {  //void doesn't return any value, if array then arr[]
        Arrays.sort(arr); // {1, 2, 3, 4} ==> {4, 3, 2, 1};
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr; //returns a value, value u can assign to varrible

    }

    //REVERSE
    public static String Reverse(String str) {  //can reverse a strin and returns string
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }
    //remove duplicates from string

    // Frequency of string

    //merge two array and return third one

    //max number from array

    //min number from array

    //REMOVE DUPLICATES
    public static String RemoveDuplicates(String str) { //str contains duplicated values
        String result = "";  //AB  //to store non duplicated characters in string

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //returns char  //A B checks indexes one by one
            if (!result.contains("" + ch)) { //contains used for String, ==> + ""
                result += ch; //if "if st-t" is true, than A will be concated to the result and so on
            }

        }
        return result;
    }

    //FREQUENCY:
    public static int Frequency(String str1, String str2) {

        int count = 0;
        while (str1.contains(str2)) { //if instead of while, than we need to repeat if several times
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over again
        }

        return count;

    }

    //FREQUENCY:           Frequency of str and chars
    public static int Frequency(String str, char ch) {  //counts the ch' frequency
        char[] arr = str.toCharArray(); // [A, B, B]

        int count = 0;  //1
        for (char each : arr) {  // each: A, B, B
            if (each == ch) {
                count++;
            }
        }
        return count;
    }


    //FREQUENCY:           Frequency of str
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

    public static int method(String str) {
        return 123;
    }

// Returns MAX number from array list:

    public static int max(ArrayList<Integer> list) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) { //i: 0, 1, 2, 3, 4

            if (list.get(i) > maximum) {  //list.get(i) each index
                maximum = list.get(i);
            }

        }

        return maximum;
    }
}


