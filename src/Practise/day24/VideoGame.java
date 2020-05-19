package Practise.day24;
/*
The video game machines at your local arcade output coupons according to how well you play the game. You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next, the program should output how many candy bars and gumballs you can get if you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"
 Example1:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1" -10 coupons
Display prompt: "Number of Gumballs: 1" - 3 coupons
 */

import java.util.Scanner;

public class VideoGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");

        int coupon = input.nextInt();

        if (coupon >= 3) {
            System.out.println("Number of Candies: " + (coupon / 10));
            System.out.println("Number of Gumballs: " + (coupon % 10) / 3);
        } else {
            System.out.println("Not enough coupons");
        }


    }




}
