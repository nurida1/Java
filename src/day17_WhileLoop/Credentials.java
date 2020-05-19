package day17_WhileLoop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Credentials {
/*
        user: cybertek
        pass: cybertek123
 */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();
        boolean valid = (username.equals("cybertek")&& password.equals("cybertek123")    ); //false
                      //validating the first username and password

        int count = 1;

        while ( !valid) {
            System.out.println("Please re enter your credentials");
            System.out.println("Enter user name");
            username = input.next();

            System.out.println("Enter Pasword");
            password = input.next();

/*        if (username.equals("cybertek")&& password.equals("cybertek123")) {
            break;
 */
            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            //validating new username and password

            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }
        }
            if (valid) {
                System.out.println("Logged in");

                /*
            int a = 10;

            System.out.println(a); // a
            System.out.println("Logged in");


 */
        }

            //System.exit
    }
}
