import java.util.Arrays;

public class ReverseArray {


    public static String [] reverse(String [] arr) {

        String[] reversed = new String[arr.length];

                int j = arr.length;
                for (int i = 0; i < arr.length; i++) { //increment 0, 1
                    j--; //1 , 0
                    reversed[i] = arr[j];
                }

        return reversed;
    }

    public static void main(String[] args) {

        String [] arr2 = {"apple", "book"};
        String [] str = reverse(arr2);

        System.out.println(Arrays.toString(str));

        }
}
