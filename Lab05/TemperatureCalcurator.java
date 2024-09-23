import  java.util.Scanner;
public class TemperatureCalcurator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for temperature in Celsius
        System.out.println("Which temperature do you want to convert?");
        System.out.println("Type 'c' if you want to convert from Fahrenheit to Celsius");
        System.out.println("Type 'f' if you want to convert from Celsius to Fahrenheit");
        String selector = input.nextLine();
        double inputTemperature;
        double convertedTemperature;

        // Convert temperature based on user input
            if (selector.equals("c")) {
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = input.nextDouble(); //Input in Fahrenheit
                convertedTemperature = (inputTemperature-32)*(5/9);
                System.out.println(inputTemperature + " Fahrenheit, " + "converted to Celsius: " + convertedTemperature);
            } else if (selector.equals("f")) {
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = input.nextDouble(); //Input in Celsius
                convertedTemperature = (inputTemperature*9/5)+32;
                System.out.println(inputTemperature + " Celsius, " + "converted to Fahrenheit: " + convertedTemperature);
            } else {
                System.out.println("Invalid input. Please enter 'c' or 'f'.");
        }
        input.close();
    }    
}
