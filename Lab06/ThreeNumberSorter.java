import java.util.Scanner;

public class ThreeNumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking the 3 input integers.
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int temp;

        //Sorting the numbers in ascending order using new variables.
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } 
        System.out.println(num1 + " <= " + num2 + " <= " + num3);
        input.close(); 
    }
}
