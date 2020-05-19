package Practise.practise;

import java.util.Scanner;

public class Length_max {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String words[] = new String[5];
        System.out.println("Enter 5 words: ");

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
            String longestword = "";
            int max = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max) {
                    max = words.length;
                    longestword = words[i];

                }
            }
            System.out.println(longestword);


    }
}


