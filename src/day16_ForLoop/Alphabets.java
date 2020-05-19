package day16_ForLoop;
/*
Print result Aa Bb CC .. Zz
 */
public class Alphabets {

    public static void main(String[] args) {
        String upperCase = ""; // A~Z
        String lowerCase = ""; // a~z

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            upperCase += ch;
        }

        System.out.println(upperCase);

        for (char ch = 'a'; ch <= 'z'; ch++) {
           lowerCase +=ch;
        }
        System.out.println(lowerCase);

        // Aa Bb Cc Dd Ee
        String result = "";

        for (int i = 0; i <= upperCase.length()-1; i++) {
            result += upperCase.charAt(i)+""+lowerCase.charAt(i)+ " ";
        }
        System.out.println(result);

        // second approach

        int a = 97;
        int A = 65; // +i it become 66

        String result2 = "";
        for (int i = 0; i <26; i++) { //
            char ch = (char) (A+i);
                 //          65+0
            char ch2 = (char) (a+i);
                //           97+0
            result2 += ch + "" + ch2 + " ";
        }
        System.out.print(result2);




    }
}