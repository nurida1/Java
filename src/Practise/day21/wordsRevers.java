package Practise.day21;
import java.util.*;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */

public class wordsRevers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");
        String result = "";

        for (int i =words.length-1; i>=0; i--) {
            String eachWords = words[i];
            result += eachWords+"\n";
        }
        System.out.println(result);

        System.out.println("==============");

        String [] words2 = sentence.split(" ");

        for(int i = words2.length-1; i>=0;i--) {
            System.out.println(words2[i]);


        }

    }
}

