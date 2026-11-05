import java.security.SecureRandom;

public class RandomSets{
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        System.out.println("a) " + (2 + 2 * rand.nextInt(5)));   // 2,4,6,8,10
        System.out.println("b) " + (3 + 2 * rand.nextInt(5)));   // 3,5,7,9,11
        System.out.println("c) " + (6 + 4 * rand.nextInt(5)));   // 6,10,14,18,22
    }
}