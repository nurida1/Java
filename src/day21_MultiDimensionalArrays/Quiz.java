package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        int wd =0; //-1+1 +2 +2 -1 =3
        String [] days = {"sun","mon","wed","sat"};

        for (int i =0; i< days.length; i++){ // loop will be executed 4 times

            switch (days[i]) {//sun will be paste 1st
                case "sat": // than sat will be executed, no break st-t
                case "sun": //
                    wd-= 1;
                    break;
                case "mon"://than mon put in switch st-t
                    wd++; //+1, there is no break st-t, so wed will be execut +2
                case "wed": // than wed will be executed +2
                    wd+=2;
            }
        }
        System.out.println(wd);

        int [] num1 = new int[3]; // [0, 0, 0]; size: 3
        int [] num2 = {1,2,3,4,5}; // size: 5
        num1 = num2; //num1 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(num1));



    }

}
