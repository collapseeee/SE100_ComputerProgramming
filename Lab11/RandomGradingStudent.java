public class RandomGradingStudent {
    public static void main(String[] args) {
        int[] student = new int[100];
        int studentA = 0;
        int studentB = 0;
        int studentC = 0;
        int studentD = 0;
        int studentF = 0;
        int totalStudent = 0;

        //create random number 1-100 for student array.
        for (int i = 0; i < student.length; i++) {
            student[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] >= 80 && student[i] <= 100) {
                studentA++;
            } else if (student[i] >= 70 && student[i] <= 79) {
                studentB++;
            } else if (student[i] >= 60 && student[i] <= 69) {
                studentC++;
            } else if (student[i] >= 50 && student[i] <= 59) {
                studentD++;
            } else {
                studentF++;
            }
        }
        totalStudent = studentA + studentB + studentC + studentD + studentF;

        //display result
        System.out.println("Student got A >>" + studentA);
        System.out.println("Student got B >>" + studentB);
        System.out.println("Student got C >>" + studentC);
        System.out.println("Student got D >>" + studentD);
        System.out.println("Student got F >>" + studentF);
        System.out.println("Total Student >>" + totalStudent);
    }    
}
