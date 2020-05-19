package day24_Methods;
/*
4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */


import java.util.Arrays;

public class TasksFromYesterday {

    public static void MaxNumber(int [] array) {
        Arrays.sort(array); // ascending order
        System.out.println("Maximum number is: " +array[array.length-1]);
    }

    public static void MinNumber(int [] array) {
        Arrays.sort(array);
        System.out.println("Minimum number is: "+ array[0]);
    }

    public static void Descending(int[] array) {

        Arrays.sort(array);

    for (int i=array.length-1; i>=0; i--){ // {100, 200,-100 };
        System.out.print(array[i]+" ");
    }
        //3 2 1
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr ={10, 8, 5, 4, 3, 2, 1};
        //  MaxNumber(10); //10 if parameter is array, the argument Must be array

        MaxNumber(arr);
        MinNumber(arr);

        Descending(arr);

        int [] arr2 = {100, 20, 30, 40, 40,-100};
        MaxNumber(arr2);
        MinNumber(arr2);
    }



}
