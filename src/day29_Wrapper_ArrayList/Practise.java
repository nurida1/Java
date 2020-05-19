package day29_Wrapper_ArrayList;
  /*
        "True" === > boolean
        "FAlSe" ==>to boolean
        "1000000000.5" ==========> float
        "123456"  =====> short
         */

public class Practise {
    public static void main(String[] args) {

        String result = "True";
        boolean r1 = Boolean.parseBoolean(result);
        System.out.println(r1); //true

        String result2 = "FAlSe";
        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2); //false

        String result3 = "1000000000.5";
        float r3 = Float.parseFloat(result3);
        System.out.println(r3);

        String result4 = "123456";
        long r4 = Long.parseLong(result4);
        System.out.println(r4);




    }

}
