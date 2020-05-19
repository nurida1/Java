package Class_warmup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,

				Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp

 */
public class Scrum_Team {

    /*
    public static void main(String[] args) {

        Testers tester1 = new Testers();
        tester1.setTesterInfo("Nurida", 11111, "Senior SDET", 160000);

        Testers tester2 = new Testers();
        tester2.setTesterInfo("George", 1223, "SDET", 110000);

        Testers tester3 = new Testers();
        tester3.setTesterInfo("Alice", 3243, "QA engineer", 120000);

        Testers tester4 = new Testers();
        tester4.setTesterInfo("Michael", 2352, "Manual tester", 100000);

        ArrayList<Testers> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4));

        System.out.println("=========================================================================");

        Developers developer1 = new Developers();
        developer1.setDeveloperInfo("Chloe", 4445, "Senior Developer", 150000);

        Developers developer2 = new Developers();
        developer2.setDeveloperInfo("John", 1094, "Java Developer", 140000);

        Developers developer3 = new Developers();
        developer3.setDeveloperInfo("Kim-ho", 2453, "Developer", 1390000);

        Developers developer4 = new Developers();
        developer4.setDeveloperInfo("Max", 8694, "Junior Developer", 100000);

        Developers developer5 = new Developers();
        developer5.setDeveloperInfo("Ashley", 9808, "Beginner ", 800000);

        ArrayList<Developers> developers = new ArrayList<>();
        developers.addAll(Arrays.asList(developer1, developer2, developer3, developer4, developer5));

        System.out.println("==========================================================================================");

    }

}
*/

    ArrayList<Testers> testersList = new ArrayList<>();

    ArrayList<Developers> developersList = new ArrayList<>();

    public void hireTester (Testers tester) {
        testersList.add(tester);

    }
    public void fireTester (long employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void hireDeveloper (Developers developer) {
        developersList.add(developer);

    }

    public void fireDeveloper(long employeeID) {
        developersList.removeIf(p -> p.employeeId == employeeID);
    }


    public void dailyStandUp () {

        System.out.println(testersList + " & " +developersList + "are conducting StandUp meeting");
    }
}






















