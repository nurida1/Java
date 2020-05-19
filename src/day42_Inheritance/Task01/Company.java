package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
public class Company {

    /*
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();

        employee1.setEmployeeInfo("Nurida", 25, 'F', 150_000, 124, "SDET");
        employee2.setEmployeeInfo("Osman", 28, 'F', 120_000, 25, "QA");
        employee3.setEmployeeInfo("Aizhan", 25, 'F', 130_000, 536, "Automation Engineer");
        employee4.setEmployeeInfo("Renata", 20, 'F', 130_000, 743, "QA");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4));

        for ( Employee each : employeeList) {
            System.out.println(each);
        }

         }
    */

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Aigerim", 18, 'F', 140_000, 65654,"QA");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Safar", 25, 'M', 140_000, 6599,"BA");

    }

    public static void main(String[] args) {
        Employee [] employees = {employee1,employee2,employee3};
        for (int i = 0; i < employees.length; i++ ) {
            //System.out.println( employees[i] );
            System.out.println( "Name: " + employees[i].name + ", ID: " + employees[i].employeeID );
        }
    }



}
