package Practise.day26;
/*
This method gets a string and returns the word count of that string.

example:
wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

 */
public class MethodsString_wordCount {

    public static int wordCount(String words) {


        int count = 0;


        for (int i = 0; i < words.length(); i++) {
            if (words.length() > count) {
                count++;
            }
        }
        return count;

    }
// its counting letters

    public static int wordCount2 (String words) {

        String [] word2 = words.split(" "); //assigning to array and count indexes
        return word2.length;

    }


    public static void main(String[] args) {

        System.out.println(wordCount("foo bar"));
        System.out.println(wordCount2("one two three"));
    }

}
