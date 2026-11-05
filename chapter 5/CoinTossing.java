import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing{
    enum Coin { HEADS, TAILS }
    static SecureRandom rand = new SecureRandom();

    public static Coin flip() {
        return rand.nextInt(2) == 0 ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int heads = 0, tails = 0;
        System.out.print("1 = Toss Coin, 2 = Exit: ");
        int choice = input.nextInt();
        while (choice == 1) {
            Coin result = flip();
            System.out.println(result);
            if (result == Coin.HEADS) heads++;
            else tails++;
            System.out.print("1 = Toss Coin, 2 = Exit: ");
            choice = input.nextInt();
        }
        System.out.println("Heads: " + heads + "  Tails: " + tails);
    }
}