package Practise.day25;

/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]

some_string = "foo"

count_appearance(some_array ,some_string )

will return 2 because some_array  has 2 appearances of "foo" string.


 */


public class MethodsWithReturn {
    public static void main(String[] args) {
        String[] arr = {"a", "foo ", "bar", "foo", "bla"};
         //             0     1      2       3     4

        String t = "foo";

        int num = count_appearance(arr, t);

        System.out.println(num);

    }

        public static int count_appearance (String [] arr, String t) { //t=foo; some_array = ["a","foo","bar","foo","bla"]

        int count_appearance = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                count_appearance++;
            }
        }
            return count_appearance;
        }



}

