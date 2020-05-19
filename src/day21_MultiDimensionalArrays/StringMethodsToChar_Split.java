package day21_MultiDimensionalArrays;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Arrays;

public class StringMethodsToChar_Split {

    public static void main(String[] args) {
        String name = "Java"; //'J', 'a','v','a'

        char[] chars = name.toCharArray(); //length =4, max index =3

        System.out.println(chars[0]); //'J'
        System.out.println(chars[3]); //'a'

        //    System.out.println(chars[4]);

        String str = "I like Java";

        String [] arr = str.split(" ");

        System.out.println(Arrays.toString(arr)); //[I, like, Java] - got an Array

        /*
        reverse sentence: day great is today
         */
//REVERSE:

        String sentence = "Today is great day";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[Today, is, great, day]

        String result = "";

        for (int i = words.length-1; i >= 0; i--) {
            String eachWords = words [i];
 //           System.out.print(eachWords+" ");
            result += eachWords+" ";
        }
        System.out.println(result); //day great is Today


        String str2 = "ABCD";
        String arr2[] = str2.split("");// ["A", "B", "C", "D"] string
        char [] ch2 = str2.toCharArray(); //['A', 'B','C', 'D', 'E', 'F', 'J'] char

        System.out.println(Arrays.toString(arr2)); //[A, B, C, D, E, F, J] returns string

        System.out.println("======================");

        int wd = 0;
        String [] days = {"sun", "mon","wed","sat"};
        for (int i = 0; i<days.length; i++) {
            switch (days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;

                case "mon":
                    wd++;
                case"wed":
                    wd+=2;

            }
        }
        int [] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4]=90;
        System.out.println(Arrays.toString(intArr));
        System.out.println(wd);

        int [] num1 =new int[3];
        int [] num2 ={1,2,3,4,5};
        num1=num2;
        for (int i =0; i<num1.length;i++) {
            System.out.println(num1[i]);

            String[] planets = {"Mercury","Venus","Earth","Mars"};
            int x = planets.length;
            int y = planets[1].length();
            System.out.println(x+ " "+y);


        }


        }



    }





