package day23_methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age); //or cast to byte = (byte)45/ compiler prefers int/ with no scan paste num in ()
    }

    public static void EligibleToBuyAlcohol(int age) {
        if ( age >= 21) {
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
    }
}
