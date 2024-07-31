import java.util.Scanner;
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take emplyee information
        System.out.println("Enter employee name: ");
        String name = input.nextLine();

        System.out.println("Working hours: ");
        double hours = input.nextDouble();

        System.out.println("Pay rate ($): ");
        double rate = input.nextDouble();

        //Tax deduction rate taking
        int federalTaxRate = 20;
        int stateTaxRate = 9;

        //Calculate gross pay
        double grossPay = hours * rate;

        //Calculate tax deductions
        double federalTax = grossPay*federalTaxRate/100;
        double stateTax = grossPay*stateTaxRate /100;
        double totalTax = stateTax+federalTax;

        //Calculate net pay
        double netPay = grossPay - (totalTax);

        //Display results
        System.out.println("Employee Name: " + name);
        System.out.println("Hours work: " +hours );
        System.out.println("Pay rate: " +rate );
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("    " + "Federal Tax Deduction (" + federalTaxRate + "%) : $" + federalTax);
        System.out.println("    " + "State Tax Deduction (" + stateTaxRate + "%) : $" + stateTax);
        System.out.println("    " + "Total Deduction: " +totalTax );
        System.out.println("Net Pay: $" + netPay);
    }
}
