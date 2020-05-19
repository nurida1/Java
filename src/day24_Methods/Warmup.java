package day24_Methods;
/*
warm up tasks:
    1. write a method called KmToMiles that can convert km to miles
                    1 km = 0.612 miles
    2. write a method called GalonsToLitters, that can convert gallons to litters
                   1 G = 3.75 L
    3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;
    4. write a method called Grade, that can print out the grade based on the score of the student
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
        Ex:
            Grade(100); ==> A
            Grade(120); ==> Invalid

 */
public class Warmup {
    public static void main(String[] args) {
    KmToMiles(5);
    GalonsToLitters(5);
    Calculation(2,3,"*");
    Grade(100);
    }

    public static void KmToMiles (double km){
     double miles = km * 0.612;
        System.out.println(km);
    }

    public static void GalonsToLitters(double gallons) {
    double litters = gallons * 3.75;
        System.out.println(gallons);

    }

    public static void Calculation (int num1, int num2, String str) {

        int result =0;
        if (str.equals("-")) {
            result += (num1 - num2);
        }
        if (str.equals("+")) {
            result += (num1 + num2);
            }
        if (str.equals("*")) {
            result += (num1 * num2);
                }
        if (str.equals("/")) {
            result += (num1 / num2);
                    }
        if (str.equals("%")) {
            result += (num1%num2);

        }
        System.out.println(result);

    }

    public static void Grade (int str ) {
        String result = "";

        if (str >= 90 && str <= 100) {
            result += "A";
        }
        else if (str >= 89 && str <= 80) {
            result += "B";
        }
        else if (str >= 79 && str <= 70) {
            result += "C";
        }
        else if (str >= 69 && str <= 60) {
            result += "D";
        }
        else if (str >= 59 && str <= 0) {
            result += "F";
        } else {
            result += "Invalid score";
        }
        System.out.println(result);
    }

}
/*
  4. write a method called Grade, that can print out the grade based on the score of the student
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
        Ex:
            Grade(100); ==> A
            Grade(120); ==> Invalid
 */