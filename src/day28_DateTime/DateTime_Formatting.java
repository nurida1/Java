package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {

    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(dateTime1);

        //Tue 12/25/2015 11:30 am, Tue

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd hh:mm a, EEE");

        System.out.println( dateTime1.format(dtf));  //12/25 11:30 AM, Пт
        String str = dateTime1.format(dtf);
        System.out.println(str);



    }

}
