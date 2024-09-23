public class SurfaceOfSphere {
    public static void main(String[] args) {
        //Declare variables for the calculation
        double pi = 3.1416;
        double radius = 2.57;

        //Calculating
        double volume = (4/3)*pi*(Math.pow(radius, 3));
        double surfaceArea = 4*pi*(Math.pow(radius, 2));
    
        //Displaying the results
        System.out.println("The volume of the 2.57 inches sphere is: " + volume + " cube inches");
        System.out.println("The surface area of the 2.57 inches sphere is: " + surfaceArea + " square inches"); 
    }
}
    
