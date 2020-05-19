package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practise2 {
    public static void main(String[] args) {
        byte age = 30;
        boolean eligibleToBuy = age > 21 || age == 21; // age>=21

        if (age>=21) {  //eligibleToBuy
            System.out.println("Here is your Vodka");
        }

        if (age<21) {   //!eligibleToBuy
            System.out.println("Go drink your milk");
        }

        boolean feelingHappy = false;

        if(feelingHappy == false) {
            System.out.println("don't be sad");
        }

        if(feelingHappy == true) {
            System.out.println("Stay happy");
        }























    }




}
