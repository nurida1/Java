package Practise.practise;

import java.util.Scanner;

public class While_loop_Practise {
    public static void main(String[] args) {

        int count, number;

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        count = 1;
        while (count <= number) {
            System.out.print(count + ",");
            count++;

        }

    }
}
