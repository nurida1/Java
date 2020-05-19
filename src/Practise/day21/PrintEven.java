package Practise.day21;

/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
 */
public class PrintEven {
    public static void main(String[] args) {
        String result ="";

        for (int i =80; i >= 20; i-=2) {
                result += i + " ";
            }

            String[] Nums = result.split(" ");

            for (String eachNum : Nums) {
                System.out.print(eachNum + " ");
            }
        }
    }


