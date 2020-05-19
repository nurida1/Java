package day17_WhileLoop;
/*practise task:
        1.write a program that can check
 */
public class PalindromeTest {

    public static void main(String[] args) {
        String str = "Level"; // level

        String reversedStr = ""; //store the reversed version of str

    int index = str.length()-1; //last index number

        while (index >= 0) {
        reversedStr += str.charAt(index);
            index -- ;
        }

        boolean palindrome = reversedStr.equalsIgnoreCase(str);

        System.out.println(palindrome);
    }
}
