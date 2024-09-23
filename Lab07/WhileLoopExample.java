
public class WhileLoopExample {
    public static void main(String[] args) {
        int i=1;
        while (i<=100) {
            if (i%10!=0) {
                System.out.print(i + " ");
            } else if (i%10==0) {
                System.out.print(i);
                System.out.println();
            }
            i++;
        }
    }    
}
