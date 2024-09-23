public class AreaCalculator {

    // Main method where the program starts execution
    public static void main(String[] args) {
        // Calling the method to calculate the area of a square with side 5
        calculateArea(5);

        // Calling the method to calculate the area of a rectangle with length 4.0 and width 6.0
        calculateArea(4.0, 6.0);

        // Calling the method to calculate the area of a circle with radius 3.0
        calculateArea(3.0);
    }

    // Method to calculate and display the area of a square
    // Takes an integer 'side' as input
    public static void calculateArea (int side) {
        System.out.println("Area of square with side " + side + ": " + side*side);
    }

    // Method to calculate and display the area of a rectangle
    // Takes two double parameters, 'length' and 'width'
    public static void calculateArea (double length, double width) {
        System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + length*width);
    }

    // Method to calculate and display the area of a circle
    // Takes one double parameter, 'radius'
    public static void calculateArea (double radius) {
        System.out.println("Area of circle with radius " + radius + ": " + (Math.PI * radius * radius));
    }
}
