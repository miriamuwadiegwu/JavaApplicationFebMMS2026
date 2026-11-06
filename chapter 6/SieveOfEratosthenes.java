public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1000];
        java.util.Arrays.fill(prime, true);

        for (int i = 2; i < prime.length; i++)
            if (prime[i])
                for (int j = 2 * i; j < prime.length; j += i)
                    prime[j] = false;

        int count = 0;
        for (int i = 2; i < prime.length; i++)
            if (prime[i]) {
                System.out.print(i + " ");
                count++;
            }
        System.out.println("\nPrimes found: " + count);
    }
}