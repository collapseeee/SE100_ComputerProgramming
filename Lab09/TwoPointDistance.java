import java.util.Scanner;
public class TwoPointDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.println("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.println("Distance between (x1,y1) and (x2,y2) is " + distance(x1,y1,x2,y2) + " units");
    }

    public static double distance(double x1,double y1,double x2, double y2) {
        double resultDistance = Math.pow(((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2))),0.5); 
        return resultDistance;
    }

}
