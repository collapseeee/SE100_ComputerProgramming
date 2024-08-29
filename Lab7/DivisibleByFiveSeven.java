/**
 * DivisibleByFiveSeven
 */
import java.util.Scanner;

public class DivisibleByFiveSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inputNumber = input.nextInt();
        int i = 1;
        int j = 0;
        while (i <= inputNumber) { 
            if (i%5 == 0 || i%7 == 0) {
                System.out.print(i + " ");
                j++;
                if (j%10 == 0) {
                    System.out.println("");
                }
            }
            i++;
        }
        System.out.println("");
        System.out.println("End of the number.");
        input.close();
        
    }
}