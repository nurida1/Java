package Practise.practise;

import java.util.Scanner;

public class VendingMachine {

        public static void main(String[] args) {

            Scanner input = new Scanner (System.in);

            System.out.println("Enter price in cents:");
            int itemPrice = input.nextInt();

            int change = 100 - itemPrice;
            int quarters= (change/25);
            int dimes = (change%25/10);
            int nickels = (change%25)%10/5;


            if (itemPrice>=25 && itemPrice<=100){

                if(itemPrice%5==0){

                    System.out.println("Your change is "+quarters+" quarters, "
                            +dimes+" dimes, and "+nickels+" nickels.");

                }else System.out.println("Invalid price!"); //should be divisible by %5

            }else{
                System.out.println("Invalid price!");
            }
        }
    }

