package day21_MultiDimensionalArrays;
/*
2. write a program that can return the logest string of text from an array
3. write a program that can return the shortest string of text from an array
 */

public class Longest_Shortest_words {

    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String longestword = ""; //or instead of "" names [0]
        String shortestword = "";

        for (int i = 0; i < names.length; i++) { //i<names.length -> length of the array

            if(names[i].length()>maxLengthString) {//anyother strings except first
                maxLengthString = names[i].length();
                longestword = names[i];
            }

            if(names[i].length()<minLengthString){
                minLengthString = names[i].length();
                shortestword = names[i];
            }



        }

        System.out.println(longestword);
        System.out.println(shortestword);
    }

}