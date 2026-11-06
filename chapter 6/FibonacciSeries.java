import java.util.Scanner;

public class FibonacciSeries {
    // a) int version
    static int fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return a;
    }

    // c) double version
    static double fibonacciDouble(int n) {
        double a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            double next = a + b;
            a = b;
            b = next;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println("fibonacci(" + n + ") = " + fibonacci(n));

        // b) largest int Fibonacci number
        long x = 0, y = 1;
        int index = 0;
        while (x + y <= Integer.MAX_VALUE) {
            long next = x + y;
            x = y;
            y = next;
            index++;
        }
        System.out.println("b) Largest int Fibonacci: F(" + index + ") = " + y);

        // c) largest double Fibonacci number
        int k = 0;
        while (!Double.isInfinite(fibonacciDouble(k + 1))) k++;
        System.out.println("c) Largest double Fibonacci: F(" + k + ") = " + fibonacciDouble(k));
    }
}