public class PyramidNumber {
    public static void main(String[] args) {
        // Print in row.
        for (int row = 0; row <= 7; row++) {
            // Print spaces on the left side.
            for (int i = row; i <= 7; i++) {
                System.out.print("     ");
            }
            // Print the number on the left side.
            for (int j = 0; j < row; j++) {
                int temp = (int)Math.pow(2, j);
                // Check the digit to print out the valid space.
                if (temp<10) {
                    System.out.print("  " + temp + "  ");
                } else if (temp>=10 && temp<100) {
                    System.out.print(" " + temp + "  ");
                } else if (temp>=100 && temp<1000) {
                    System.out.println("" + temp + "  ");
                }
            }
            // Print out the number on the miidle and right side.
            for (int l = row; l >= 0; l--) {
                int temp = (int)Math.pow(2, l);
                if (temp<10) {
                    System.out.print("  " + temp + "  ");
                } else if (temp>=10 && temp<100) {
                    System.out.print(" " + temp + "  ");
                } else if (temp>=100 && temp<1000) {
                    System.out.print("" + temp + "  ");
                }
            }
            // Print out spaces on the right side.
            for (int k = 1; k < row; k++) {
                System.out.print("     ");
            }

            System.out.println("");
        }
    }
}
