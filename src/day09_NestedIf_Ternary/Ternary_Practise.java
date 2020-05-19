package day09_NestedIf_Ternary;

public class Ternary_Practise {
    public static void main(String[] args) { //        char ch1 = '+'; //'+', '-', '0'-not as number, char is designed for character
        int number =100 ;
        char ch1 = ' ';

        if (number >0) {
            ch1 = '+';

        } else if (number <0) {
            ch1 = '-';
        }else {
                ch1 = '0';
        }

        char ch2 = (number > 0) ? '+' : (number <0) ? '-' : '0';

        System.out.println(ch1);
        System.out.println(ch2);

        // System.out.println(ch1 + ch2); // concatenation is only for String, otherwise it is always number

        System.out.println("===================================");

        byte score = 90;
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "Excellent";
        }else if (score >= 80 && score < 90){
            grade = "Great";
        }else if (score >=70 && score <80) {
            grade = "Good";
        }else if (score >=60 && score <70) {
            grade = "Pass";
        }else if (score <60 && score >0) {
            grade = "Failed";
        }else {  //if score is less than 0 and greater than 100
            grade = "Invalid";
        }
        System.out.println(grade);

        String grade2 = (score >= 90 && score <= 100) ? "Excellent" : (score >= 80 && score < 90) ? "Great"
                : (score >=70 && score <80)? "Good" : (score >= 60 && score <70)? "Pass"
                : (score <60 && score >0)? "Failed" : "Invalid";
        System.out.println(grade2);

        System.out.println("======================================");

        int num =1000;
        if (num %2 ==0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

//        (num %2 == 0) ? System.out.println ("Even number") : System.out.println ("Odd number")

// we can only apply ternary to returning value
    }
}
