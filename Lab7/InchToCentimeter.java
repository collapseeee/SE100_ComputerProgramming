public class InchToCentimeter {
    public static void main(String[] args) {
        int i = 1;
        double resultInCentimeter = 0;
        System.out.println("Inches           Centimeters");
        while (i <= 200) {
            resultInCentimeter = (i*2.54);
            if (i < 10) {
                System.out.println(i + "                " + resultInCentimeter);
            } else if (i < 100) {
                System.out.println(i + "               " + resultInCentimeter);
            } else if (i < 10000) {
                System.out.println(i + "              " + resultInCentimeter);
            }
            i = i+2;
        }
    }
}
