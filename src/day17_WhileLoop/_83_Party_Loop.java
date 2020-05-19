package day17_WhileLoop;

import java.util.Scanner;

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */
public class _83_Party_Loop {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String totalList = " ";

        while (true) {
            System.out.println("Please enter guest name:");
            String guest = input.next();
            totalList += guest + ", ";

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " +totalList.substring(0,totalList.length()-2));
            break;
            }
        }




    }

}
