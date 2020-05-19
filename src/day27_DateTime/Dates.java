package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthdate = LocalDate.of(1995,03,01);
        System.out.println(birthdate);

        //isAfter(date2)
        boolean result1 = date1.isAfter(birthdate);
        System.out.println(result1); //true

        //isBefore(date2)
        boolean result2 = date1.isBefore(birthdate);
        System.out.println(result2); //false

        //isEqual(date2)
        boolean result3 = date1.isEqual(birthdate);
        System.out.println(result3);  //false

        //isLeapyear (february has 29 days):
        boolean result4 = birthdate.isLeapYear();
        System.out.println(result4); //false

        System.out.println("===============================");

        LocalDate now = LocalDate.now(); // 2020 - 04 - 23
        System.out.println("Today is: " + now);

        LocalDate birthDay = LocalDate.of(1990,04,25);
        int month  = birthDay.getMonthValue();
      //  int days = birthDay.get Do at home
//Delete "-"
        String str = now.toString();  // after converting to string, you can do manipulations
        System.out.println(str.replace("-", " "));

        //month / day / year








    }


}
