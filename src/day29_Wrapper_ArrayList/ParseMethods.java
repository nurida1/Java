package day29_Wrapper_ArrayList;

import java.time.LocalDate;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str); //123

        System.out.println(str + 1 ); //text
                          //"123" + 1 ==> "1231"
        System.out.println(a1 + 1); // number //124
                         // 123 + 1 ==> 124

        byte b1 = Byte.parseByte(str);   //byte = 123

        System.out.println( b1 + 5);

       // Integer I1 = Byte.parseByte(str); Integer accepts only int, you need to cast

        Integer I1 = (int) Byte.parseByte(str); // AutoBoxing
        //Integer I1 = (int)(short) Byte.parseByte(str); // doesn't accepts short primitive, only accepts int, therefore cast to int
        //Integer I1 = (int)byte;
        // Integer = int;


        String str2 = "12.5";

        float f1 = Float.parseFloat( str2 ); // float 10.5

        System.out.println(f1 + 1);  //13.5

        double f2 = Double.parseDouble(str2); //double 12.5

        System.out.println(f2 + 1);  //13.5

        String str3 = "3147483647";

        double num1 = Long.parseLong(str3); //long  3147483647L

        System.out.println(num1 + 2);

        Long num2 = Long.parseLong(str3);   //autoboxing

        System.out.println(num2 + 2);


        String result1 = "true"; // not "true" or "false" ==> false

        boolean r1 = Boolean.parseBoolean(result1); //boolean

        System.out.println(r1); //false because it's not matching with true or false (!r)-"false"


        String result2 = "fALsE"; //"false"
        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2);  //"false" ignores case sensitivity



























    }


}
