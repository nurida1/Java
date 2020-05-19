package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;
import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); //Integer, 123

        System.out.println(a);

        double b = Integer.valueOf(str);  //unboxing
        //double = Integer

        System.out.println(b);


        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double  // none

        double d2 = Double.valueOf(str2); //15.5
        //  double  = Double   /Unboxing


        System.out.println(d1); //15.5
        System.out.println(d2); //15.5

        System.out.println(d1 == d2); //true

        System.out.println("===============================");

        //only wrapper classes dedicated to primitives

        int z1 = 2000;
        // Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;


        //Value of:

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1);
        //Boolean = Boolean //none

        boolean t2 = Boolean.valueOf(r1); //Boolean,true
        //boolean = Boolean //unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===============================");
        int maxNum =Integer.MAX_VALUE; //2147483647

        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE; //1.7976931348623157E308

        System.out.println(maxNum2);


        int minNum = Integer.MIN_VALUE; //-2147483648
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE; //127
        System.out.println(maxNum3);

        byte minNum2 =Byte.MIN_VALUE;
        System.out.println(minNum2); //-128

        System.out.println("=================================");

        boolean [] arr = new boolean[3];
        System.out.println(Arrays.toString(arr));  //[false, false, false]

        Integer [] arr2 = new Integer[3];
        System.out.println(Arrays.toString(arr2));  //[null, null, null]





    }


}
