package day38_Constructors;
/*
Task03:
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double  ((hourlyRate * weeklyHours * 48)
                salaryAftertax(): retuns the salary after tax as double  ( salary - stateTax - federalTax)
                stateTax(): retuns the total state tax as double     ( salary * stateTaxRate)
                federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {
    // These are our instance variables
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    // This is our Constructor that can initialize our instance variables like this:
    // The name of our Constructor method MUST match our class name
    // we provide the AccessModifier(here public) then name then we pass parameters if we need to (here we need 4 arguments)
    public SalaryCalculator (double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        // This constructor method will run every time I create an object
    }
    // 1st instance method: to calculate total salary (gross income)
    public double salary() { //annual income
        return hourlyRate * weeklyHours * 48;
    }
    // 2nd instance method: to calculate state tax
    public double stateTax () {  //total tax paid to the state
        return salary() * stateTaxRate;
    }


    // 3rd instance method: to calculate federal tax
    public double federalTax () { //total tax paid to the federal
        return  salary() * federalTaxRate;
    }

    // 4th instance method: to calculate salary after tax
    public double salaryAfterTax () {
        return salary() - (stateTax() + federalTax());
    }
    // to get net salary (after tax) we subtract taxes (both) from our total salary

    public String toString () {
        //  DecimalFormat DF = new DecimalFormat("0.00"); /// we can add this format to apply to salary
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }






}
