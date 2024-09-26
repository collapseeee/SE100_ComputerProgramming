/**
 * AnalyzeNumbers
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
        input.close();
        System.out.println("All numbers entered: " + printArray(numbers));
        System.out.println("Maximum number: " + findMax(numbers));
        System.out.println("Minimum number: " + findMin(numbers));
    }
    public static String printArray(double[] numbers) {
        String allNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            allNumber = allNumber + numbers[i] + " ";
        }
        return allNumber;
    }
    public static double findMax(double[] numbers) {
        double maxNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }
    public static double findMin(double[] numbers) {
        double minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}