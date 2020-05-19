package OfficeHours.Practise_05_06_2020;


import Class_warmup.Testers;
import Resources.Test;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
        /*
        create scrum2 : 4 developers, 2 testers
        create scrum3 : 5 developers, 3 testers

        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000

        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
            1.remove all the testers who have salary < 100000;
            2. remove all the developers who have salary < 120000;

            NOTE: Do NOT create any ArrayList of Testers or Developers.
                  Use the ArrayLists in ScrumTeam class only
         */

public class AppleINC {

    public static void main(String[] args) {

        // SCRUM TEAM 2:
        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 75000, 1234);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John", "Junior Tester", 75000, 234);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman", "SDET", 120000, 2341);

        Tester tester4 = new Tester();
        tester4.setInfo("Nicole", "SDET", 130000, 3124);

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy", "Senior developer", 120000, 1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Developer", 100000, 223232);

        Developer dev3 = new Developer();
        dev3.setInfo("Bruno", "Front-end developer", 145000, 1241);

        Developer dev4 = new Developer();
        dev4.setInfo("Alessandro", "Junior Developer", 130000, 9832);

        Developer dev5 = new Developer();
        dev5.setInfo("Nurida", "Developer", 150000, 1715);


        System.out.println("============================================================================================");
//SCRUM TEAM 1:

        ScrumTeam scrum1 = new ScrumTeam(); //we can use the arrayList in scrumteam class
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester3);
        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);
        scrum1.hireADeveloper(dev3);

        //scrum1.fireATester(1245 );
        //scrum1.fireADeveloper(1122337);
        //scrum1.testersTeam // returns the testersTeam arrayList from scrum1

        for (Tester each : scrum1.testersTeam) { //prints out every single tester from scrum team
            System.out.println(each);          //testersTeam-arrayList in ScrumTeam
        }

        for (Developer each : scrum1.devpTeam) {  //arraylist of developer in scrum team
            System.out.println(each);

            System.out.println(scrum1.devpTeam.size());

        }
        System.out.println("In my scrum team, We have " + scrum1.testersTeam.size() + " testers and " +
                scrum1.devpTeam.size() + " developers");


        //SCRUM TEAM 2: 4 developers, 2 testers

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireATester(tester2);
        scrum2.hireATester(tester4);
        scrum2.hireADeveloper(dev1);
        scrum2.hireADeveloper(dev2);
        scrum2.hireADeveloper(dev3);
        scrum2.hireADeveloper(dev4);

        for (Tester each : scrum2.testersTeam) {
            System.out.println(each);
        }

        for (Developer each : scrum2.devpTeam) {
            System.out.println(each);
        }

        //SCRUM TEAM 3: 5 developers, 3 testers

        ScrumTeam scrum3 = new ScrumTeam();
        scrum3.hireATester(tester1);
        scrum3.hireATester(tester2);
        scrum3.hireATester(tester3);

        scrum3.hireADeveloper(dev1);
        scrum3.hireADeveloper(dev2);
        scrum3.hireADeveloper(dev3);
        scrum3.hireADeveloper(dev4);
        scrum3.hireADeveloper(dev5);

        for (Tester each : scrum3.testersTeam) {
            System.out.println(each);
        }

        for (Developer each : scrum3.devpTeam) {
            System.out.println(each);
        }

        System.out.println("=========================================================================================================");
        ScrumTeam[] scrum = {scrum1, scrum2, scrum3};

        /*
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000

         */

        for (int i = 0; i < scrum.length; i++) {
            if (scrum[i].devpTeam.get(i).salary < 120000) {
            }
            System.out.println("Developer name: " + scrum[i].devpTeam.get(i).name);

            if (scrum[i].testersTeam.get(i).salary > 120_000) {
                System.out.println("Tester name: " + scrum[i].testersTeam.get(i).name);
            }

        }


        ArrayList<ScrumTeam> ScrumList = new ArrayList<>(Arrays.asList());

        System.out.println(Arrays.toString(ScrumList.toArray()));

        for (int i =0; i < ScrumList.size(); i++ ) {

            ScrumTeam eachScrum = ScrumList.get(i);

            Tester eachTester = eachScrum.testersTeam.get(i);
            Developer eachDeveloper = eachScrum.devpTeam.get(i);

            long testerID = eachTester.employeeId;
            long devID = eachDeveloper.employeeId;

            double testerSalary = eachTester.salary;
            double devSalary = eachDeveloper.salary;

            if (testerSalary < 100_000) {
                eachScrum.fireATester(testerID);
            }

            if (devSalary < 120_000) {
                eachScrum.fireADeveloper(devID);
            }

            System.out.println(Arrays.toString(ScrumList.toArray()));

        }

        /*
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
             1.remove all the testers who have salary < 100000;
            2. remove all the developers who have salary < 120000;
         */

    }
}



















