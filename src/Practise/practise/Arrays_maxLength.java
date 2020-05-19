package Practise.practise;
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */

import java.util.Scanner;

public class Arrays_maxLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter words: ");

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        String longestword = "";

        int max = 0;

        for(int i = 0; i < words.length; i++) {

            if (words[i].length()>max){
                max = words[i].length();
                longestword = words[i];
            }
        }
        System.out.println(longestword);


    }


}
