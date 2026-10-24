import java.util.Scanner;
 
public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] q = {
            "Q1 text\n1. A\n2. B\n3. C\n4. D",
            "Q2 text\n1. A\n2. B\n3. C\n4. D",
            "Q3 text\n1. A\n2. B\n3. C\n4. D",
            "Q4 text\n1. A\n2. B\n3. C\n4. D",
            "Q5 text\n1. A\n2. B\n3. C\n4. D"
        };
        int[] answers = {1, 2, 3, 4, 1}; // correct answers
        int correct = 0;
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            System.out.print("Answer: ");
            if (in.nextInt() == answers[i]) correct++;
        }
        if (correct == 5) System.out.println("Excellent");
        else if (correct == 4) System.out.println("Very good");
        else if (correct <= 3) System.out.println("Time to brush up on your knowledge of global warming");
        System.out.println("Sources: <list the websites you actually used>");
    }
}
