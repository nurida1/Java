package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {
        //DataType variableName = Data;

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;

        //salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks; // total salary before tax

        //salary * stateTaxRate
        double stateTax = salary    * stateTaxRate;

        //federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - federalTax;
       // double salaryAfterTax = salary - (stateTax + federalTax);  //= salary - stateTax - federalTax;

        // totalTax = stateTax +federalTax
        double totalTax = stateTax + federalTax;

        //salaryAfterTax = salary - stateTax - federalTax;
        double salaryAfterTax = salary + federalTax;

        //concatenation
        System.out.println("Your salary is: $" + salary); //concatenation
        System.out.println("State tax is: $" +stateTax); //concatenation
        System.out.println("Federal tax is: $" +federalTax); //concatenation
        System.out.println("Total Tax is: $" + ( federalTax +stateTax ) );
        System.out.println("Salary After Tax is: $" +salaryAfterTax);

               //

        System.out.println("9"+3); //93, concatenation
        System.out.println(9+ "3"); // 93, concatenation















    }
}
