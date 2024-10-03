public class MultipleChoiceGrading {
    public static void main(String[] args) {
        char[] correctAnswers = 
            {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        char[][] studentsAnswers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //Student 0
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //Student 1
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //Student 2
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //Student 3
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //Student 4
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //Student 5
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //Student 6
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}}; //Student 7

        //Provoking Methods;
        printStudentScore(answerChecker(studentsAnswers, correctAnswers));
            
    }
    public static int[] answerChecker(char[][]studentsAnswers, char[]correctAnswers) {
        int[] studentsScore = new int[studentsAnswers.length];
        for (int i = 0; i < studentsAnswers.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < studentsAnswers[i].length; j++) {
                if (studentsAnswers[i][j] == correctAnswers[j]) {
                    totalScore++;
                }
            }
            studentsScore[i] = totalScore;
        }
        return studentsScore;
    }
    public static void printStudentScore (int[] studentsScore) {
        for (int i =0; i<studentsScore.length; i++) {
            System.out.println("Student " + i + "'s correct count is " + studentsScore[i]);
        }
    }
}
