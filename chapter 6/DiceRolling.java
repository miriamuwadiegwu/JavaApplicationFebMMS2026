import java.util.Random;

public class DiceRolling{
    public static void main(String[] args){
        Random rand = new Random();
        int[] frequency = new int[13];
        for (int roll = 1; roll <= 36_000_000; roll++) {
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            frequency[die1 + die2]++;
        }
        System.out.printf("%-6s%s%n", "Sum", "Frequency");
        for (int sum = 2; sum <= 12; sum++)
            System.out.printf("%-6d%d%n", sum, frequency[sum]);
    }
}