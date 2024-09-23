import java.util.Scanner;
public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for investment amount and interest rate
        System.out.print("Enter investment amount: ");
        double initialInvestment = input.nextDouble();

        System.out.print("Enter annual interest rate (in percent): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of year: ");
        int year = input.nextInt();

        // Calculate future value
        annualInterestRate = annualInterestRate / 100;
        double futureValue = initialInvestment * Math.pow(1 + annualInterestRate, year);

        // Display results
        System.out.println("The future value is " + futureValue);
    }
}
