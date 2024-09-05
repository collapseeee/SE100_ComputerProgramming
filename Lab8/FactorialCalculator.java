import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take the number input from the user as the factorial base.
        System.out.print("Enter the factorial base: ");
        int inputNumber = input.nextInt();

        //Find the factorial result.
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result = result*i;
        }

        //Display the factorial and the multiplication process.
        System.out.print(inputNumber + "! = ");
        for (int i = 1; inputNumber > i; inputNumber--) {
            System.out.print(inputNumber + " * ");
        }
        System.out.print("1 = " + result);

        input.close();
    }
}
