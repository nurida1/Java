package OfficeHours.Practise_04_22_2020;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class void_Method {
    /*
    hello 5 times
     */
    public static void main(String[] args) {

    print();

        System.out.println("===================");

        boolean USCitizen = true;
        int age = 20;
        Vote(age, USCitizen);

        Vote(35, false);

        System.out.println("==============");

        //Cigarettes: age 28
        EligibleToBuyCig(17);


    }

    public static void print () {

        for (int i =0; i<5; i++) {
            System.out.println("Hello Batch 18");
        }


    }

    //write a function that can identify if a person is eligible to vote
        // MUST know: age, USCitizen

    public static void Vote(int age, boolean USCitizen) {   ///boolean if USCitizen-true

        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote yet");
        }
        //you don't need to return anything, because its void method

    }


    //write a method if a person is eligible to buy cigarettes
    // Must know: age

    public static void EligibleToBuyCig(int age) {

        if (age > 18) {
            System.out.println("Eligible to buy");
        } else {
            System.out.println("Not eligible");
        }
    }



}
