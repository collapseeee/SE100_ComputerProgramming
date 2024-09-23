import java.util.Scanner;
public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the angle in degrees: ");
        int degrees = input.nextInt();

        //Make degrees less than 360
        if (degrees>360) {
            degrees = degrees % 360;
        } else if (degrees>720) {
            degrees = degrees % 720;
        }
        
        //Define on axis degrees
        switch (degrees) {
            case 0 -> System.out.println("The point lies on the positive x-axis.");
            case 90 -> System.out.println("The point lies on the positive y-axis.");
            case 180 -> System.out.println("The point lies on the negative x-axis.");
            case 270 -> System.out.println("The point lies on the negative y-axis.");
        }

        //Define on quadrant
        if (degrees>0 && degrees<90) {
            System.out.println("The point lies in quadrant 1");
        } else if (degrees>90 && degrees<180) {
            System.out.println("The point lies in quadrant 2");
        } else if (degrees>180 && degrees<270) {
            System.out.println("The point lies in quardrant 3");
        } else if (degrees>270 && degrees<360) {
            System.out.println("The point lies in quadrant 4");
        }
    }
}
