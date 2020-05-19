package day17_WhileLoop;
/*
write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)

 */


import java.util.Scanner;

public class CheckCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i == 0; ) { //declare true variable to continue executing infinite times

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Math operator: ");
            // char operator = input.next().charAt(0);  // to return char  // +, -, *, /, %
           String operator = input.next(); // +, -, *, /, %
        //    char operator = input.next().charAt(0);

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid operator");
            }

            System.out.println("Do you wanna continue?");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the calculator");
                break;
            }

        }
    }
}

