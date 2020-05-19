package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {
        /// MMM - gives Apr
        //MM - gives 04

        //days_month_year

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //2020/04/23
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); // 04/23/2020

        LocalDate date1 = LocalDate.now(); //2020 -04-23
        System.out.println(date1.format(dtf));

        /*
        create a date called birthDay: month /Days/year
        ex: 2020 04 23
        Apr/23/20
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");

        LocalDate date2 = LocalDate.of(1999, 12, 25);
        String str1 = date2.format(dtf2);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();

        System.out.println(date3.format(dtf2));








    }
}
