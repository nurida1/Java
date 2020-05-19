package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Nurida", 170_000, 123, "Software Developer", 'F') ;

        //dev1.reporting(); cannot call, it belongs to tester
        dev1.fixingBug();

        System.out.println(dev1);

        Tester tester1 = new Tester("Zhenya", 180_000, 135, "SDET", 'F');

        //tester1.coding (); Tester's object doesn't have this action

        tester1.reporting();
        System.out.println( tester1 );

        BusinessAnalyst BA1 = new BusinessAnalyst("Ozgur", 120_000, 789, 'M');
        //BA1.coding(); it's not exist in Business Analyst's object
        //BA1.fixingBug();
        BA1.writingReq();
        BA1.gathering();
        System.out.println( BA1 );


    }

}
