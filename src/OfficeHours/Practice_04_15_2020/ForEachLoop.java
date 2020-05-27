package OfficeHours.Practice_04_15_2020;

public class ForEachLoop {
    /*
    for each loop: - iterated loop,
                for ( DataType variableName : Array ) {
    }

    Arrays- one of the data structures
     */
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};

        for ( int eachNum : arr) {
            if (eachNum == 3) {
                //continue;
                break;
            }
            System.out.println(eachNum);
        }

    }
}
