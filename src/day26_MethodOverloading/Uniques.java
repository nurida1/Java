package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {

        String str = "ABBCDB";

        String result = ""; // A
        for (int i = 0; i < str.length(); i++) { // finds unique characters from string and assigns to result
            int num = Frequency(str, str.charAt(i)); // shows each character
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
//another solution:
        String str2 = "Cybertek";
        String result2 =uniques(str2);
        System.out.println(result2);

    }

    public static String uniques (String str) {  // " AABCDCD"
        String result = ""; // A
        for (int i = 0; i < str.length(); i++) { // finds unique characters from string and assigns to result
            int num = Frequency(str, str.charAt(i)); // shows each character
            if (num == 1) {
                result += str.charAt(i);
            }
        }
       return result;
    }


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
}