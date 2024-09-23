import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int inputNum = input.nextInt();    
    if (isPerfect(inputNum)) {
        System.out.println(inputNum + " is a perfect number.");
    } else {
        System.out.println(inputNum + " is NOT a perfect number.");
    }
    }

    public static Boolean isPerfect(int number) {
        int sum = 0;
        for (int i=1; i<number; i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        return (sum==number);
    }
}
