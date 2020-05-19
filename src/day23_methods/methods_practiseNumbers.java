package day23_methods;
/*
task:
	1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
 */

public class methods_practiseNumbers {
    public static void main(String[] args) {
        printOdd();
        System.out.println();
        printEven();
    }

    public static void printOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void printEven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }
}