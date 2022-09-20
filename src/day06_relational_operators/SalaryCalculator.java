package day06_relational_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
            create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
         */

        double salary = 100_000;
        double stateTaxRate= 0.08;
        double fedTaxRate = 0.21;

        double stateTax;
        double federalTax;
        double totalTaxAmount;
        double salaryAfterTax;

        stateTax = salary*stateTaxRate;
        federalTax = salary*fedTaxRate;
        totalTaxAmount = stateTax+federalTax;
        salaryAfterTax = salary- totalTaxAmount;

        String report = "| Salary "+salary+" | State tax rate: "+stateTaxRate+" | Federal Tax Rate: "+fedTaxRate+
                "\nState Tax deducted: "+ stateTax+
                "\nFederal Tax Deducted: "+ federalTax+
                "\nTotal Taxes deducted: "+ totalTaxAmount+
                "\nTotal salary after all taxes deducted: "+ salaryAfterTax;

        double monthlySalary = salaryAfterTax/12;

        System.out.println(report);
        System.out.println("Monthly salary: "+ monthlySalary);


    }
}
