import java.util.Scanner;

public class TrigonometricFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking the function selection
        System.out.println("Select the function you want based on the number:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Hyperbolic Sine");
        System.out.println("5. Hyperbolic Cosine");
        System.out.println("6. Hyperbolic Tangent");
        System.out.println("Enter your choice: ");
        int selectedChoice = input.nextInt();
        //Taking degree input
        System.out.println("Enter degree: ");
        double inputDegree = input.nextDouble();
        double result;
        double inputRadians = Math.toRadians(inputDegree);
        
        //Calculating based on the selected choice
        switch (selectedChoice) {
            case 1:
            result = Math.sin(inputRadians);
            System.out.println("sin("+inputDegree+") is " + result);
            break;

            case 2:
            result = Math.cos(inputRadians);
            System.out.println("cos("+inputDegree+") is "+ result);
            break;

            case 3:
            result = Math.tan(inputRadians);
            System.out.println("tan("+inputDegree+") is " + result);
            break;

            case 4:
            result = Math.sinh(inputRadians);
            System.out.println("sinh("+inputDegree+") is " + result);
            break;

            case 5:
            result = Math.cosh(inputRadians);
            System.out.println("cosh("+inputDegree+") is " + result);
            break;

            case 6:
            result = Math.tanh(inputRadians);
            System.out.println("tanh("+inputDegree+") is " + result);
            break;
            
            default:
            System.out.println("Error! Please select a number between 1-6!");
            break;
        }
        
    }
}
