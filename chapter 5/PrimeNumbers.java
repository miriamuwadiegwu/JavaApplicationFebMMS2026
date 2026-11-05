public class PrimeNumbers {
    static int tests;

    // Parts (a) and (b): checks up to n/2
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            tests++;
            if (n % i == 0) return false;
        }
        return true;
    }

    // Part (c): checks up to the square root of n
    public static boolean isPrimeSqrt(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            tests++;
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int count = 0;
        for (int n = 2; n < 10000; n++)
            if (isPrime(n)) {
                count++;
                System.out.print(n + " ");
            }
        System.out.println("\nPrimes: " + count + "  Tests using n/2: " + tests);

        tests = 0;
        count = 0;
        for (int n = 2; n < 10000; n++)
            if (isPrimeSqrt(n))
                count++;
        System.out.println("Primes: " + count + "  Tests using sqrt(n): " + tests);
    }
}