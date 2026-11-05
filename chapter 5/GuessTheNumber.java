import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            int answer = 1 + rand.nextInt(1000);
            int guesses = 0;
            System.out.println("Guess a number between 1 and 1000");
            int guess = input.nextInt();
            guesses++;

            while (guess != answer) {
                if (guess > answer)
                    System.out.println("Too high. Try again.");
                else
                    System.out.println("Too low. Try again.");
                guess = input.nextInt();
                guesses++;
            }
            System.out.println("Congratulations. You guessed the number!");

            // 5.31 modification (delete this block for plain 5.30)
            if (guesses < 10)
                System.out.println("Either you know the secret or you got lucky!");
            else if (guesses == 10)
                System.out.println("Aha! You know the secret!");
            else
                System.out.println("You should be able to do better!");

            System.out.print("Play again? (y/n): ");
            again = input.next();
        }
    }
}