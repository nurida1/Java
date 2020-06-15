package day49_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{

/*
 4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers
 */
    public static void main(String[] args) {

        Employee tester1 = new Tester("Halo", 123, 150000, 1234);
        Employee tester2 = new Tester("Mila", 456, 100000, 4567);
        Employee tester3 = new Tester("Mike", 789, 120000, 8910);

        Employee developer1 = new Developer("John", 101112, 100000,111213 );
        Employee developer2 = new Developer("Moni", 131415, 130000, 141516);
        Employee developer3 = new Developer("Chris", 161718, 150_000, 141414);
        Employee developer4 = new Developer("George", 192021, 140_000, 151617);

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(tester1,tester2,tester3, developer1,developer2,developer3,developer4));
        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,developer1,developer2,developer3,developer4));

        for (int i = 0; i < scrumTeam.size(); i++) {
            scrumTeam.get(i);
        }

        System.out.println("====================================================================================================================");

        tester1.work();
        tester3.toString();

        System.out.println("=====================================================================================================================");

        scrumTeam.removeIf(employee -> employee.salary <= 100_000);

        for (Employee each : scrumTeam) {
            System.out.println(each);
        }

    }



}
