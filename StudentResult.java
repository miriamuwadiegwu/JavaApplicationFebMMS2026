public class StudentResult {

    // Method 1: Accept one integer score
    void calculateResult(int score) {
        System.out.println("Single Score: " + score);
    }

    // Method 2: Accept two integer scores
    void calculateResult(int score1, int score2) {
        double average = (score1 + score2) / 2.0;
        System.out.println("Average of Two Scores: " + average);
    }

    // Method 3: Accept three integer scores
    void calculateResult(int score1, int score2, int score3) {
        double average = (score1 + score2 + score3) / 3.0;
        System.out.println("Average of Three Scores: " + average);
    }

    // Method 4: Accept two decimal scores
    void calculateResult(double score1, double score2) {
        double average = (score1 + score2) / 2.0;
        System.out.println("Average of Two Decimal Scores: " + average);
    }

    public static void main(String[] args) {
        StudentResult student = new StudentResult();

        student.calculateResult(80);
        student.calculateResult(70, 80);
        student.calculateResult(75, 80, 85);
        student.calculateResult(80.5, 90.0);
    }
}