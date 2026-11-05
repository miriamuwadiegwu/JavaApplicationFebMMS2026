import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsWithWager {
    enum Status { CONTINUE, WON, LOST }
    static SecureRandom rand = new SecureRandom();

    public static int rollDice() {
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        int sum = die1 + die2;
        System.out.println("Player rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    public static String chatter() {
        switch (1 + rand.nextInt(3)) {
            case 1: return "Oh, you're going for broke, huh?";
            case 2: return "Aw c'mon, take a chance!";
            default: return "You're up big. Now's the time to cash in your chips!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;

        System.out.print("Enter your wager: ");
        int wager = input.nextInt();
        while (wager > bankBalance || wager <= 0) {
            System.out.print("Invalid wager. Enter again: ");
            wager = input.nextInt();
        }

        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case 7: case 11:
                gameStatus = Status.WON;
                break;
            case 2: case 3: case 12:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Point is " + myPoint);
        }

        while (gameStatus == Status.CONTINUE) {
            System.out.println(chatter());
            sumOfDice = rollDice();
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == 7)
                gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON) {
            bankBalance += wager;
            System.out.println("Player wins. Bank balance: $" + bankBalance);
        } else {
            bankBalance -= wager;
            System.out.println("Player loses. Bank balance: $" + bankBalance);
            if (bankBalance == 0)
                System.out.println("Sorry. You busted!");
        }
    }
}
