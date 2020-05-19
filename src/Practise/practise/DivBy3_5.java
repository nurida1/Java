package Practise.practise;
/*
	1. write a program that can print all
	the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
	 */

public class DivBy3_5 {
    public static void main(String[] args) {

        String num = "";

        for (int i = 0; i <= 100; i++) {
           if (i % 2 != 0) {
            if (i % 3 == 0 && i % 5==0) {
                System.out.print(i+" ");
                }
            }

        }

    }

}
