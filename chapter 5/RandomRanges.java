import java.security.SecureRandom;

public class RandomRanges{
    public static void main(String[] args){
        SecureRandom rand = new SecureRandom();
        int a = 1 + rand.nextInt(2);        // 1 <= n <= 2
        int b = 1 + rand.nextInt(100);      // 1 <= n <= 100
        int c = rand.nextInt(10);           // 0 <= n <= 9
        int d = 1000 + rand.nextInt(113);   // 1000 <= n <= 1112
        int e = -1 + rand.nextInt(3);       // -1 <= n <= 1
        int f = -3 + rand.nextInt(15);      // -3 <= n <= 11
        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
        System.out.println("e) " + e);
        System.out.println("f) " + f);
    }
}
