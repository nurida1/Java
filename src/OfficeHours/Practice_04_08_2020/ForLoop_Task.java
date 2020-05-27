package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
        /*
        print all the numbers between 0 ~ 100 that can be divisible by 3 or 5
         */

        for(int i = 0; i<=100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
            System.out.println();
            System.out.println("===============");
            // length      123456
            String name = "Nurida";       //a
            // Index number012345

            String result = ""; // adiruN
            int lastIndex = name.length()-1;

            for (int i = lastIndex; i >= 0; i-- ) {
//                System.out.print(name.charAt(i));
           // result += name.charAt(i);
           result = result + name.substring(i, i+1);
                             //             5, 5+1  ==> a
                             //             4, 5 because of loop i -- to 0  ==> d
                             //             3, 4  ==> i
                             //             2, 3  ==> r
                            //
            }
            System.out.println(result);

            if(name.equalsIgnoreCase(result)) {
                System.out.println(name + " is palindrome name");
            }else {
                System.out.println(name + " is not palindrome name");
            }


        }


    }






