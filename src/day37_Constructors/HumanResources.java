package day37_Constructors;
/*
2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
 */
public class HumanResources {
    //we initialized these objects as static... which means we can only use them inside the class
    // the advantage of having static ==> to call them through the class name.
    // our class name here is HumanResources
    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

    /*
    public static void main(String[] args) {

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }
     */

    static{
        employee1.setInfo("Zuleyha", 1254, 123123123, "QA", 110_000,'F');
        employee2.setInfo("Kyle", 241, 24523423, "SDET", 110_000, 'M');
        employee3.setInfo("Marina", 9785, 2242531, "Product Manager", 170_000, 'M');
        employee4.setInfo("Adeline", 7664, 579353, "Scrum Master", 80_000, 'M');
        employee5.setInfo("Jazi", 536, 395234, "Business Analyst", 70_000, 'M');


    }




}
