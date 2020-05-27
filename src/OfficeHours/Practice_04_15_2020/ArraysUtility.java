package OfficeHours.Practice_04_15_2020;
import java.util.Arrays;

public class ArraysUtility {
    /*
    Arrays.sort(): sorts the array in Ascending order
    Arrays.equal(arr1, arr2);  to check equality of two arrays
    Arrays.toString(); converts single dimensional array to string

    Arrays.deeptoString(); converts multidimensional array
     */
    public static void main(String[] args) {
        int [] arr = {9, 10, 8, 65, 8, 6, 5};

        Arrays.sort(arr); //

        System.out.println(Arrays.toString(arr));

        int [] salaries = {9,8,10,2,3,4,5,6 };
//        int length = salaries.length;
//        int lastIndex = length - 1;

        Arrays.sort(salaries); // ascending order

        System.out.println(Arrays.toString(salaries));

        System.out.println("Minumum salary: " + salaries[0]);
        System.out.printf("Maximum salary: "+salaries[salaries.length-1]);

        System.out.println("================");

        int [] arr1 = {1, 2, 3}; //{1, 2, 3}
        int [] arr2 = {1, 2, 3}; //{1, 2, 3}

        Arrays.sort(arr1); //
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2)); //true




    }

}
