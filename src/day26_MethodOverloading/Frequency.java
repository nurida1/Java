package day26_MethodOverloading;

public class Frequency {
    /*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"

     */

    public static void main(String[] args) {
        String str = "ABBAAAAAAAAA";
        char ch = 'A';

        char[] arr = str.toCharArray(); // [A, B, B]

        int count = 0;  //1
        for (char each : arr) {  // each: A, B, B
            if (each == ch) {
                count++;
            }
        }
        System.out.println(count);

        String str2 = "ABCDEFGABABABABA";
        char ch2 = 'B';
        int num2 =frequency (str2, ch2); // how many times char occured in a string
        System.out.println(num2);
    }

    public static int frequency(String str, char ch) {  //counts the ch' frequency
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