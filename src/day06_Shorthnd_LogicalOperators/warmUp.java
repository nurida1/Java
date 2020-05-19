package day06_Shorthnd_LogicalOperators;

import java.sql.SQLOutput;

public class warmUp {

    public static void main(String[] args) {
        double numberOfGalons = 1;
        double galonsToLiters = numberOfGalons * 3.875;
        String result = numberOfGalons + "gallons is equal to: " + galonsToLiters+" liters";
        System.out.println(result);

        System.out.println("===========================================================================");
        double  numberOfLiters = 1;
        double  litersToGalons = numberOfLiters / 3.785;
        String result2 = numberOfLiters +" liters equal to "+litersToGalons+ "galons";
        System.out.println(result2);

        System.out.println("============================================================================");
        int a = 200; //201 //200 //199
        int b = -a++ + - --a * a-- % 2;
        // b = -200 + - -200 *  200 %2
        // b = -200 - 40000 % 2
        // b = -200 + 0
        //b = -200

        System.out.println(b);
        System.out.println(a);

        System.out.println("==========================================");
        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //  z = 300 + 400 - 300 * 400 + 300 / 400
        //  z =300 + 400 - 120000 + 300/400
        //  z = 300 + 400 - 120000 + 0            300/400 ==> 0.75
        //  z = 700-120000
        // z = 119300
        System.out.println(z);





    }


}
/*warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
Collapse

 */