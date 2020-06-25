package Practise.LinkedIn;

import java.util.Random;

public class Libraries {
    public static void main(String[] args) {
        double power = Math.pow(5,3); //5*5*5
        System.out.println(power); //125.0

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot); //8.0

        Random rand = new Random(); //import java.util.Random
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber); //354321 // everytime gives different options
        System.out.println(randomNumberWithBound); // between 0 and 9// every time gives different options

    }

}
