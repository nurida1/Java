package Practise.day26;
/*
return unique characters from parameter
uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
public class Unique_MethodWithString {
    public static void main(String[] args) {

        System.out.println(uniqueChars("abcd")); //gter
    }


    public static String uniqueChars(String str) {

        String result = "";
 //       str=str.toLowerCase(); //equals ignore case

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
                if (count == 1) {
                    result += str.charAt(i);

            }

        }
        return result;

    }






}
