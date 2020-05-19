package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        // here we will create our object
        SalaryCalculator Nurida = new SalaryCalculator(60, 40, 6.25/100, 5.05/100 );
        // to calculate Zareen's salary we call the method salary()
        System.out.println(Nurida.salary());
        // to print all Zareen's salary info ==> we pass the object Zareen in print statement and it will print according to toString() method :
        System.out.println(Nurida);
            /*
            115200.0
            Hourly Rate: $60.0
            Weekly Hours: 40
            Gross Salary: $115200.0
            State Tax: $7200.0
            Federal Tax: $5817.599999999999
            Net Salary: $102182.4
             */

        System.out.println("======================================================");
        // here we will create our 2nd object:
        SalaryCalculator Namik = new SalaryCalculator(62, 40, 8.75/100, 0.26) ;
        // now we will pass our object Namik in print statement to get all details about his salary like this:
        System.out.println(Namik);
            /*
            Hourly Rate: $62.0
            Weekly Hours: 40
            Gross Salary: $119040.0
            State Tax: $10416.0
            Federal Tax: $30950.4
            Net Salary: $77673.6

             */


    }
}
