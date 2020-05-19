package day23_methods;
/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};
        //               0    1    2    3    4

  //      for (String each : arr) { //3: A B C

        for (int j =0; j < arr.length; j++) {  // repeat as many times as length

            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {  // to compary each element to others
                if (arr[i].equals(arr[j])) { //equals(each)
                    count2++;
                }
            }

            if (count2 == 1) {
                System.out.println(arr[j]); //(each)
            }

        }

            System.out.println("=========================");

            //solution2:
            for (String each2 : arr) { //sout: A, B, A

                int count = 0;
                for (String each : arr) { //how many times is occured in array, frequency of each element
                    if (each.equals(each2)) { //each compares string of text
                        count++;
                    }
                }
                if (count == 1) { //if the character is unique
                    System.out.println(each2);


                }

            }
                /*
             TO DO with array:
                String str = "AAABBCC" ===> A3B2C2
                [A,A,A,B,B,C,C]

                */
    }
    }
