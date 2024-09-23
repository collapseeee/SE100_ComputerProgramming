import java.util.Scanner;
public class TwoNumberComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.println("Enter your first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter your second number: ");
        int secondNumber = input.nextInt();

        // Compare the two numbers
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second”");
        } else if (firstNumber < secondNumber) {
            System.out.println("The first number is no greater than the second");
        } else {
            System.out.println("These two number are equal");
        }
        input.close();
    }
}
