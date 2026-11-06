import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] topics = {
            "Climate change", "Clean water access", "Education",
            "Healthcare", "Poverty reduction"
        };
        int[][] responses = new int[5][10]; // [topic][rating-1] = number of ratings

        System.out.print("Number of people taking the survey: ");
        int people = in.nextInt();

        for (int p = 1; p <= people; p++) {
            System.out.println("Person " + p + ": rate each issue from 1 (least) to 10 (most important)");
            for (int t = 0; t < topics.length; t++) {
                int rating;
                do {
                    System.out.print(topics[t] + ": ");
                    rating = in.nextInt();
                } while (rating < 1 || rating > 10);
                responses[t][rating - 1]++;
            }
        }

        System.out.printf("%-22s", "Issue");
        for (int r = 1; r <= 10; r++) System.out.printf("%4d", r);
        System.out.printf("%10s%n", "Average");

        int[] totals = new int[5];
        for (int t = 0; t < 5; t++) {
            System.out.printf("%-22s", topics[t]);
            int count = 0;
            for (int r = 0; r < 10; r++) {
                System.out.printf("%4d", responses[t][r]);
                totals[t] += responses[t][r] * (r + 1);
                count += responses[t][r];
            }
            System.out.printf("%10.2f%n", count == 0 ? 0.0 : (double) totals[t] / count);
        }

        int hi = 0, lo = 0;
        for (int t = 1; t < 5; t++) {
            if (totals[t] > totals[hi]) hi = t;
            if (totals[t] < totals[lo]) lo = t;
        }
        System.out.println("Highest point total: " + topics[hi] + " (" + totals[hi] + ")");
        System.out.println("Lowest point total: " + topics[lo] + " (" + totals[lo] + ")");
    }
}