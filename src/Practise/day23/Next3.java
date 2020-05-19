package Practise.day23;

import java.util.Scanner;

public class Next3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        next3(num);
    }

    public static void next3(int num) {

        for (int i = 0; i < 3; i++) {
            num++;
            System.out.print(num+" ");

        }
    }
}





    /*
            switch(num){
            case 1:
                num += 1;
                System.out.println(num);
            case 2:
                num += 1;
                System.out.println(num);
            case 3:
                num += 1;
                System.out.println(num);
     */