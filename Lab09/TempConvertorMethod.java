import java.util.Scanner;

public class TempConvertorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) { 
            System.out.println("Select temperature to convert: ");
            System.out.println("   Type c, Fahrenheit to Celsius");
            System.out.println("   Type f,  Celsius to Fahrenheit");
            System.out.println("   Type exit, to exit the program.");
            System.out.println("Type here: ");
            String selector = input.nextLine();
            selector = selector.toLowerCase();
            System.out.println("=======================================");

            if (selector.equals("exit")) {
                System.out.println("Exiting the program..."); 
                break;
            } else if (selector.equals("c")) {
                System.out.print("Enter the temperature in Fahrenheit: ");
                int inputFahrenheit = input.nextInt();
                input.nextLine();
                double result = toCelsius(inputFahrenheit);
                System.out.println(inputFahrenheit + " Fahrenheit is " + result + (" in Celsius."));
            } else if (selector.equals("f")) {
                System.out.print("Enter the temperature in Celsius: ");
                int inputCelsius = input.nextInt();
                input.nextLine();
                double result = toFahrenheit(inputCelsius);
                System.out.println(inputCelsius + " Celcius is " + result + (" in Fahrenheit."));
            } else {
                System.out.println("You must enter a valid string!");
            }
            System.out.println("=======================================");
        }
    }
    public static double toCelsius(int inputNum) {
        int tempFahrenhein = inputNum;
        int resultCelsius = (tempFahrenhein-32)*5/9;
        return resultCelsius; 
    }
    public static double toFahrenheit(int inputNum) {
        int tempCelsius = inputNum;
        int resultFahrenheit = ((9*tempCelsius)/5)+32;
        return resultFahrenheit;
    }
}
