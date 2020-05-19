package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practise {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // number + Enter ==> 30 + Enter

        System.out.println("Your age is: "+ age);

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Your full name is: "+fullName);




    }



}
