package OfficeHours.Practice_03_25_2020;

public class multiBranchIf_Practise {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {  //false
            System.out.println("It's positive number");
        } else if (number < 0) {  //false
            System.out.println("It's negative number");
        } else {
            System.out.println("It's zero");
        }

        int num1 =100;
        int num2 =200;

        if (num1>num2) {
            System.out.println(num1+" is greater than "+num2);
        }else if (num1<num2){
            System.out.println(num2+" is greater than "+num1);
        }else{
            System.out.println(num1+" is equal to "+num2);
        }

        System.out.println("=====================================");

        String browserName ="";

        if (browserName=="Firefox") {
            System.out.println("Firefox browser is opening");
        } else if (browserName == "Chrome") {
            System.out.println("Chrome browser is opening");
        }else if (browserName == "Internet explorer") {
            System.out.println("IE browser is opening");
        }else if (browserName == "Safari") {
            System.out.println("Safari browser is opening");
        }else if (browserName == "Opera") {
            System.out.println("Opera browser is opening");
        }else {
            System.out.println("Invalid Browser Name");
        }

    }
}

