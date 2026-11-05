import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction{
    static SecureRandom rand = new SecureRandom();
    static int correctAnswer;

    // 5.35 (separate method), 5.38 (difficulty), 5.39 (problem type)
    public static void createQuestion(int level, int type) {
        int max = (int) Math.pow(10, level);
        int a = rand.nextInt(max);
        int b = 1 + rand.nextInt(max - 1 > 0 ? max - 1 : 1);
        if (type == 5)
            type = 1 + rand.nextInt(4);

        String op;
        switch (type) {
            case 1: op = "plus";  correctAnswer = a + b; break;
            case 2: op = "minus"; correctAnswer = a - b; break;
            case 3: op = "times"; correctAnswer = a * b; break;
            default:
                op = "divided by";
                a = b * rand.nextInt(max / b + 1);   // whole-number result
                correctAnswer = a / b;
        }
        System.out.print("How much is " + a + " " + op + " " + b + "? ");
    }

    // 5.36: varied responses using random 1-4 and a switch
    public static void sayCorrect() {
        switch (1 + rand.nextInt(4)) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }

    public static void sayIncorrect() {
        switch (1 + rand.nextInt(4)) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String another = "y";

        while (another.equalsIgnoreCase("y")) {
            System.out.print("Difficulty level (1 = one digit, 2 = two digits...): ");
            int level = input.nextInt();
            System.out.print("Type (1 add, 2 subtract, 3 multiply, 4 divide, 5 mixed): ");
            int type = input.nextInt();

            // 5.37: count correct and incorrect responses over 10 questions
            int correct = 0, incorrect = 0;
            for (int q = 1; q <= 10; q++) {
                createQuestion(level, type);
                int answer = input.nextInt();
                while (answer != correctAnswer) {
                    incorrect++;
                    sayIncorrect();
                    System.out.print("Try again: ");
                    answer = input.nextInt();
                }
                correct++;
                sayCorrect();
            }

            double percentage = 100.0 * correct / (correct + incorrect);
            System.out.printf("You got %.1f%% correct.%n", percentage);
            if (percentage < 75)
                System.out.println("Please ask your teacher for extra help.");
            else
                System.out.println("Congratulations, you are ready to go to the next level!");

            System.out.print("Another student? (y/n): ");
            another = input.next();
        }
    }
}