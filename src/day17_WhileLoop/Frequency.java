package day17_WhileLoop;
public class Frequency {

    public static void main(String[] args) {

        String str = "EEee".toLowerCase();

        int count = 0; // +1+1+1

        String word = "E".toLowerCase();  //ignoring the case sensetivity by converting both string to lowercase

        while (str.contains(word)) {

            count++;
        str = str.replaceFirst(word,""); //after counting the first "Java", we need to remove it
        }

        System.out.println(count);


}
                }

