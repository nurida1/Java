package day15_ForLoop;

import java.util.Scanner;

/*
write a program to identify if a string is palindrome or not. If yes ==> true, otherwise ==> false
        level ==> level==> palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        int lastIndexnum = word.length()-1;
        String reverse = "";

        for (int i = lastIndexnum; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (reverse.equalsIgnoreCase(word)) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
