package day25_MethodsRecap;
/*
	1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
	2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
	3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */
public class Frequency {

    public static void main(String[] args) {
        String str1 = "javajavajavajavajava"; //remove first A ==> AA
        String str2 = "java";

        int count = 0;
        while (str1.contains(str2)) { //if instead of while, than we need to repeat if several times
            count++;
            str1 = str1.replaceFirst(str2, "");
                   // we need to make sure that we are not counting the same index over again
        }

        System.out.println(str1);
        System.out.println(count);

        String a = "AABBBCDEFAA";
        String b = "A";

        int num1 = Frequency(a,b); //4

        System.out.println(num1);
    }

    public static int Frequency (String str1, String str2){

        int count = 0;
        while (str1.contains(str2)) { //if instead of while, than we need to repeat if several times
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over again
        }

        return count;
    }

}
