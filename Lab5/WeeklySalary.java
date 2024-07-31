import java.util.Scanner;
public class WeeklySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter working hours: ");
        double workHours = input.nextDouble();
        double grossPay;
        if (workHours <= 40) {
            grossPay = workHours * 8.0;
        } else {
            grossPay = 320 + ((workHours - 40)*12);
        }
        System.out.println("Gross Pay: $" + grossPay);
        input.close();
    }
}
