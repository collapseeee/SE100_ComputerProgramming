import java.util.Scanner;

public class ReturnNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String inputNum = input.nextLine();

        for (int i = 0; i < inputNum.length(); i++) {
            char digitChar = inputNum.charAt(i); // Get each digit as a char
            int digit = Character.getNumericValue(digitChar); // Convert char to int
            returnNum(digit);
        }
    }
    public static void returnZero() {
        System.out.println("");
        System.out.println("  000000  ");
        System.out.println(" 00    00 ");
        System.out.println(" 00    00 ");
        System.out.println(" 00    00 ");
        System.out.println("  000000  ");
        System.out.println("");
    }

    public static void returnOne() {
        System.out.println("");
        System.out.println("   111    ");
        System.out.println(" 11 11    ");
        System.out.println("    11    ");
        System.out.println("    11    ");
        System.out.println(" 11111111 ");
        System.out.println("");
    }

    public static void returnTwo() {
        System.out.println("");
        System.out.println("   22222  ");
        System.out.println(" 22   222 ");
        System.out.println("    222   ");
        System.out.println("  222     ");
        System.out.println(" 22222222 ");
        System.out.println("");
    }

    public static void returnThree() {
        System.out.println("");
        System.out.println(" 333333   ");
        System.out.println("      333 ");
        System.out.println("   33333  ");
        System.out.println("      333 ");
        System.out.println(" 333333   ");
        System.out.println("");
    }

    public static void returnFour() {
        System.out.println("");
        System.out.println("    444   ");
        System.out.println("   4444   ");
        System.out.println("  44 44   ");
        System.out.println(" 44444444 ");
        System.out.println("     44   ");
        System.out.println("");
    }

    public static void returnFive() {
        System.out.println("");
        System.out.println(" 5555555  ");
        System.out.println(" 555      ");
        System.out.println(" 5555555  ");
        System.out.println("      555 ");
        System.out.println(" 5555555  ");
        System.out.println("");
    }

    public static void returnSix() {
        System.out.println("");
        System.out.println("  6666666 ");
        System.out.println(" 66       ");
        System.out.println(" 6666666  ");
        System.out.println(" 66    66 ");
        System.out.println("  666666  ");
        System.out.println("");
    }

    public static void returnSeven() {
        System.out.println("");
        System.out.println(" 7777777 ");
        System.out.println("     77  ");
        System.out.println("    77   ");
        System.out.println("   77    ");
        System.out.println("  77     ");
        System.out.println("");
    }

    public static void returnEight() {
        System.out.println("");
        System.out.println("  88888  ");
        System.out.println(" 88   88 ");
        System.out.println("  88888  ");
        System.out.println(" 88   88 ");
        System.out.println("  88888  ");
        System.out.println("");
    }

    public static void returnNine() {
        System.out.println("");
        System.out.println("  99999  ");
        System.out.println(" 99   99 ");
        System.out.println("  999999 ");
        System.out.println("      99 ");
        System.out.println("  99999  ");
        System.out.println("");
    }
    public static void returnNum(int num) {
        switch (num) {
            case 0: returnZero(); break;
            case 1: returnOne(); break;
            case 2: returnTwo(); break;
            case 3: returnThree(); break;
            case 4: returnFour(); break;
            case 5: returnFive(); break;
            case 6: returnSix(); break;
            case 7: returnSeven(); break;
            case 8: returnEight(); break;
            case 9: returnNine(); break;
        }
     }
}
