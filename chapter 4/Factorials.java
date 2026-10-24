public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-5s%s%n", "n", "n!");
        long fact = 1;
        for (int n = 1; n <= 20; n++) {
            fact *= n;
            System.out.printf("%-5d%d%n", n, fact);
        }
    }
}
