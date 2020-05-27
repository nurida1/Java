package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {

         Tester tester1 = new Tester();
         tester1.name = "Muhtar";
         tester1.jobTitle = "SDET";
         tester1.salary = 90000;
         tester1.employeeId = 12345;


        System.out.println( tester1 );

        Tester tester2 = new Tester();
        tester2.setInfo("Onur", "Junior SDET", 100000, 1234);
        System.out.println(tester2);

        tester1.smokeTesting(); //Muhtar is doing smoke test
        tester2.smokeTesting(); //Onur is doing smoke test

        tester2.creatingTicket();  //Onur is creating ticket



    }



}
